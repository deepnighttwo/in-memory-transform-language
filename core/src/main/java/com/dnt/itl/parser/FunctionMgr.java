package com.dnt.itl.parser;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * User: Mark Zang
 * Date: 2015/4/21
 * Time: 17:00
 */
public class FunctionMgr {

    Map<String, Function> functionMap = new HashMap<>();

    public FunctionMgr() {
        DefaultFunctions defaultFunctions = DefaultFunctions.getInstance();
        for (Method method : DefaultFunctions.class.getMethods()) {
            this.addFunction(method.getName(), new Function(method, defaultFunctions));
        }

    }

    public Object callFunction(String funcName, Object[] args) throws InvocationTargetException, IllegalAccessException {
        Function func = functionMap.get(funcName);
        if (func == null) {
            throw new RuntimeException("function not found:" + funcName);
        }
        return func.call(args);
    }

    public Object addFunction(String funcName, Function function) {
        return functionMap.put(funcName, function);
    }

}
