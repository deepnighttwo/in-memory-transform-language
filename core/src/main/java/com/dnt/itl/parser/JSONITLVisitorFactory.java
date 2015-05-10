package com.dnt.itl.parser;

import com.dnt.itl.ext.ExtensionFunction;
import com.dnt.itl.grammar.ITLBaseVisitor;

import java.lang.reflect.Method;

/**
 * User: Mark Zang
 * Date: 2015/4/22
 * Time: 17:07
 */
public class JSONITLVisitorFactory implements ITLVisitorFactory {

    @Override
    public ITLBaseVisitor<Object> createVisitor() throws Exception {
        FunctionMgr functionMgr = new FunctionMgr();

        Method method = ExtensionFunction.class.getMethod("isGoodIncome", double.class, String.class, double.class);
        Function func = new Function(method, null);
        functionMgr.addFunction("isGoodIncome", func);
        JSONITLVisitor visitor = new JSONITLVisitor();
        visitor.setFunctionMgr(functionMgr);
        return visitor;
    }
}
