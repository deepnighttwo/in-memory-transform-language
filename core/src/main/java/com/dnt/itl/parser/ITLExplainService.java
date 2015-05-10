package com.dnt.itl.parser;

import com.dnt.itl.grammar.ITLLexer;
import com.dnt.itl.grammar.ITLParser;
import com.google.gson.Gson;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;

/**
 * not thread safe
 * <p/>
 * User: Mark Zang
 * Date: 2015/4/22
 * Time: 17:02
 */
public class ITLExplainService {

    Map<String, List<QlContextWithId>> ds2Ctx = new HashMap<>();

    static Gson gson = new Gson();

    JSONITLVisitor visitor;


    public ITLExplainService() {
        FunctionMgr functionMgr = new FunctionMgr();

        visitor = new JSONITLVisitor();
        visitor.setFunctionMgr(functionMgr);

    }

    public void addFunction(String funcName, Method method, Object on) {
        visitor.getFunctionMgr().addFunction(funcName, new Function(method, on));
    }

    public synchronized void addITL(Object id, String ITL) {
        ANTLRInputStream inputStream = null;
        try {
            inputStream = new ANTLRInputStream(new ByteArrayInputStream(ITL.getBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        ITLLexer lexer = new ITLLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        ITLParser ITLParse = new ITLParser(tokenStream);

        ITLParser.QlContext qlContext = ITLParse.ql();

        String fromSource = qlContext.from().fromSource.getText();

        List<QlContextWithId> ctxs = ds2Ctx.get(fromSource);
        if (ctxs == null) {
            ctxs = new ArrayList<>();
            ds2Ctx.put(fromSource, ctxs);
        }

        QlContextWithId qlContextWithId = new QlContextWithId(id, qlContext);

        ctxs.add(qlContextWithId);
    }

    public synchronized boolean removeITL(Object id) {
        for (List<QlContextWithId> qlContexts : ds2Ctx.values()) {
            if (qlContexts.remove(id)) {
                return true;
            }
        }
        return false;
    }

    public Map<Object, Object> process(String datasource, String json) {

        Map data = gson.fromJson(json, Map.class);

        return this.process(datasource, data);
    }

    public Map<Object, Object> process(String datasource, Object json) {

        List<QlContextWithId> qlContexts = ds2Ctx.get(datasource);

        if (qlContexts == null) {
            return Collections.EMPTY_MAP;
        }


        Map<Object, Object> rets = new HashMap<>();

        for (QlContextWithId qlContextWithId : qlContexts) {
            Object id = qlContextWithId.id;
            ITLParser.QlContext qlContext = qlContextWithId.qlContext;

            visitor.setRawData(json);
            Object var = visitor.visit(qlContext);
            rets.put(id, var);
        }

        return rets;
    }

}

class QlContextWithId {

    public QlContextWithId(Object id, ITLParser.QlContext qlContext) {
        this.id = id;
        this.qlContext = qlContext;
    }

    Object id;

    ITLParser.QlContext qlContext;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QlContextWithId)) return false;

        QlContextWithId that = (QlContextWithId) o;

        return !(id != null ? !id.equals(that.id) : that.id != null);

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
