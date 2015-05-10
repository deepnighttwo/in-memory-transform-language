package com.dnt.itl.parser;

import com.dnt.itl.grammar.ITLBaseVisitor;
import com.dnt.itl.grammar.ITLLexer;
import com.dnt.itl.grammar.ITLParser;
import org.antlr.v4.runtime.misc.NotNull;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * User: Mark Zang
 * Date: 2015/4/16
 * Time: 15:22
 */
public class JSONITLVisitor extends ITLBaseVisitor<Object> {

    // FIXME: might cause OOM if too many method is cached...
    static Map<Class, Map<String, Method>> methodCache = new HashMap<>();

    private Object rawData;

    private Object currData;

    private Map result;

    private FunctionMgr functionMgr;

    public FunctionMgr getFunctionMgr() {
        return functionMgr;
    }

    public void setFunctionMgr(FunctionMgr functionMgr) {
        this.functionMgr = functionMgr;
    }

    public JSONITLVisitor(Object rawData) {
        this.rawData = rawData;
    }

    public JSONITLVisitor() {
    }

    public Object getRawData() {
        return rawData;
    }

    public void setRawData(Object rawData) {
        this.rawData = rawData;
    }

    @Override
    public Object visitQl(@NotNull ITLParser.QlContext ctx) {

        if (ctx.from().fromAlias != null) {
            String fromAlias = ctx.from().fromAlias.getText();
            Map mixData = new HashMap();
            mixData.put(fromAlias, rawData);
            rawData = mixData;
        }
        if (ctx.where() != null && ((boolean) visit(ctx.where()) == false)) {
            return null;
        }

        Object retData = visit(ctx.select());
        return retData;
    }

    @Override
    public Object visitSelect(@NotNull ITLParser.SelectContext ctx) {
        result = new LinkedHashMap();
        super.visitSelect(ctx);
        return result;
    }

    @Override
    public Object visitPropsSel(@NotNull ITLParser.PropsSelContext ctx) {
        String alias = ctx.ID() == null ? "default name" : ctx.ID().getText();
        Object var = visit(ctx.propVar());

        result.put(alias, var);
        return var;
    }

    @Override
    public Object visitFloatVar(@NotNull ITLParser.FloatVarContext ctx) {
        return Double.valueOf(ctx.getText());
    }

    @Override
    public Object visitNullVar(@NotNull ITLParser.NullVarContext ctx) {
        return null;
    }

    @Override
    public Object visitCharVar(@NotNull ITLParser.CharVarContext ctx) {
        return ctx.CharacterLiteral().getText().charAt(1);
    }

    @Override
    public Object visitFuncVar(@NotNull ITLParser.FuncVarContext ctx) {

        String funName = ctx.ID().getText();

        List<ITLParser.PropFullNameContext> propFullNameContexts = ctx.propFullName();

        Object[] args = new Object[propFullNameContexts.size()];
        int i = 0;
        for (ITLParser.PropFullNameContext propFullNameContext : propFullNameContexts) {
            args[i] = visit(propFullNameContext);
            i++;
        }

        try {
            return functionMgr.callFunction(funName, args);
        } catch (InvocationTargetException e) {
            return null;
        } catch (IllegalAccessException e) {
            return null;
        }
    }

    @Override
    public Object visitMulDiv(@NotNull ITLParser.MulDivContext ctx) {
        double var1 = ((Number) (visit(ctx.propVar(0)))).doubleValue();
        double var2 = ((Number) (visit(ctx.propVar(1)))).doubleValue();

        if (ctx.op.getType() == ITLLexer.MUL) {
            return var1 * var2;
        } else {
            if (var2 == 0) {
                return Double.MAX_VALUE;
            }
            return var1 / var2;
        }
    }

    @Override
    public Object visitAddSub(@NotNull ITLParser.AddSubContext ctx) {
        double var1 = ((Number) (visit(ctx.propVar(0)))).doubleValue();
        double var2 = ((Number) (visit(ctx.propVar(1)))).doubleValue();

        if (ctx.op.getType() == ITLLexer.ADD) {
            return var1 + var2;
        } else {
            return var1 - var2;
        }
    }

    @Override
    public Object visitParens(@NotNull ITLParser.ParensContext ctx) {
        return visit(ctx.propVar());
    }

    @Override
    public Object visitDirectPropVar(@NotNull ITLParser.DirectPropVarContext ctx) {
        return visit(ctx.propFullName());
    }

    @Override
    public Object visitIntVar(@NotNull ITLParser.IntVarContext ctx) {
        return Integer.parseInt(ctx.getText());
    }

    @Override
    public Object visitBooleanVar(@NotNull ITLParser.BooleanVarContext ctx) {
        return visit(ctx.booleanLiteral());
    }

    @Override
    public Object visitStringVar(@NotNull ITLParser.StringVarContext ctx) {
        String txt = ctx.StringLiteral().getText();
        return txt.substring(1, txt.length() - 1);
    }

    @Override
    public Object visitPropFullName(@NotNull ITLParser.PropFullNameContext ctx) {
        currData = rawData;

        List<ITLParser.PropNameContext> propNameContexts = ctx.propName();
        Object ret = null;
        for (ITLParser.PropNameContext propNameContext : propNameContexts) {
            ret = visit(propNameContext);
        }
        return ret;
    }

    @Override
    public Object visitPropName(@NotNull ITLParser.PropNameContext ctx) {

        if (currData == null) {
            return null;
        }

        List<ITLParser.IntegerLiteralContext> indexCtxs = ctx.integerLiteral();
        String propName = ctx.ID().getText();

        try {
            getPropValue(propName);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (currData == null) {
            return null;
        }

        if (indexCtxs == null || indexCtxs.isEmpty()) {
            return currData;
        } else {
            getListOrArrayValue(indexCtxs);
            return currData;
        }
    }

    private void getPropValue(String propName) throws Exception {
        if (currData instanceof Map) {
            currData = ((Map) currData).get(propName);
            return;
        }

        // need to be standard java bean
        Class clazz = currData.getClass();
        Map<String, Method> clazzMethodCache = methodCache.get(clazz);
        if (clazzMethodCache == null) {
            clazzMethodCache = new HashMap<>();
            methodCache.put(clazz, clazzMethodCache);
        }

        Method method = clazzMethodCache.get(propName);

        String propMethodStr = null;
        if (method == null) {
            propMethodStr = "get" + Character.toUpperCase(propName.charAt(0)) + propName.substring(1);
            try {
                method = clazz.getMethod(propMethodStr);
            } catch (NoSuchMethodException e) {
                propMethodStr = "is" + Character.toUpperCase(propName.charAt(0)) + propName.substring(1);
                method = clazz.getMethod(propMethodStr);
            }
            clazzMethodCache.put(propName, method);
        }

        currData = method.invoke(currData);
    }


    private void getListOrArrayValue(List<ITLParser.IntegerLiteralContext> indexCtxs) {
        for (ITLParser.IntegerLiteralContext indexCtx : indexCtxs) {
            Integer index = (Integer) visit(indexCtx);
            if (currData instanceof List) {
                currData = ((List) currData).get(index);
            } else {
                currData = ((Object[]) currData)[index];
            }
        }
    }

    @Override
    public Object visitIntegerLiteral(@NotNull ITLParser.IntegerLiteralContext ctx) {
        return Integer.parseInt(ctx.getText());
    }

    @Override
    public Object visitFalseBool(@NotNull ITLParser.FalseBoolContext ctx) {
        return Boolean.FALSE;
    }

    @Override
    public Object visitTrueBool(@NotNull ITLParser.TrueBoolContext ctx) {
        return Boolean.TRUE;
    }

    @Override
    public Object visitNotBool(@NotNull ITLParser.NotBoolContext ctx) {
        return !((Boolean) this.visit(ctx.boolExpr()));
    }

    @Override
    public Object visitExprBool(@NotNull ITLParser.ExprBoolContext ctx) {
        int type = ctx.boolOprt.getType();
        switch (type) {
            case ITLLexer.AND:
                return (Boolean) this.visit(ctx.boolExpr(0)) && (Boolean) this.visit(ctx.boolExpr(1));
            case ITLLexer.OR:
                return (Boolean) this.visit(ctx.boolExpr(0)) || (Boolean) this.visit(ctx.boolExpr(1));
            default:
                throw new RuntimeException("Unsupported operation " + ctx.boolOprt.getText());
        }
    }

    @Override
    public Object visitParenBool(@NotNull ITLParser.ParenBoolContext ctx) {
        return this.visit(ctx.boolExpr());
    }

    @Override
    public Object visitCompareBool(@NotNull ITLParser.CompareBoolContext ctx) {

        Comparable var1 = (Comparable) this.visit(ctx.propVar(0));

        Comparable var2 = (Comparable) this.visit(ctx.propVar(1));

        if (var1 == null && var2 == null) {
            return true;
        }

        if (var1 == null || var2 == null) {
            return false;
        }

        int dataType1 = ComputeUtils.getType(var1);
        int dataType2 = ComputeUtils.getType(var2);

        if (dataType1 * dataType2 < 0) {
            throw new RuntimeException("data not comparable: data1(" + var1.getClass().toString() + ")=" + var1 + ", data2(" + var2.getClass().toString() + ")=" + var2);
        }

        int type = ctx.compareOpr.getType();

        if (dataType1 == dataType2) {
            return comparableCompare(type, var1, var2);
        }
        // both is number but has different type
        int dataMask1 = dataType1 & ComputeUtils.TYPE_MASK;
        int dataMask2 = dataType2 & ComputeUtils.TYPE_MASK;
        if (dataMask1 == dataMask2 && dataMask1 == ComputeUtils.INT_NUM) {
            return comparableCompare(type, ((Number) var1).longValue(), ((Number) var2).longValue());
        } else {
            return comparableCompare(type, ((Number) var1).doubleValue(), ((Number) var2).doubleValue());
        }

    }


    private boolean comparableCompare(int type, Comparable var1, Comparable var2) {
        switch (type) {
            case ITLLexer.SMALLER:
                return var1.compareTo(var2) < 0;
            case ITLLexer.SMALLEROREQ:
                return var1.compareTo(var2) <= 0;
            case ITLLexer.EQUALS:
                return var1.compareTo(var2) == 0;
            case ITLLexer.NOTEQUAL:
                return var1.compareTo(var2) != 0;
            case ITLLexer.BIGGER:
                return var1.compareTo(var2) > 0;
            case ITLLexer.BIGGEROREQ:
                return var1.compareTo(var2) >= 0;
            default:
                throw new RuntimeException("Unsupported operation type " + type);
        }
    }


}
