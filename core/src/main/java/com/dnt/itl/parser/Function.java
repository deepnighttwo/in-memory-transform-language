package com.dnt.itl.parser;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * User: Mark Zang
 * Date: 2015/4/21
 * Time: 17:02
 */
public class Function {

    Method method;

    Object on;

    public Function(Method method, Object on) {
        this.method = method;
        this.on = on;
    }

    public Object call(Object[] args) throws InvocationTargetException, IllegalAccessException {
        return method.invoke(on, args);
    }
}
