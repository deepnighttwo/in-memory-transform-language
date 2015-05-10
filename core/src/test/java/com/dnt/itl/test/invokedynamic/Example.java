package com.dnt.itl.test.invokedynamic;

/**
 * User: Mark Zang
 * Date: 2015/5/2
 * Time: 22:39
 */

import java.lang.invoke.*;

class Example {

    static {
    }

    public static CallSite mybsm(
            MethodHandles.Lookup callerClass, String dynMethodName, MethodType dynMethodType)
            throws Throwable {

        MethodHandle mh =
                callerClass.findStatic(
                        Example.class,
                        "IntegerOps.adder",
                        MethodType.methodType(Integer.class, Integer.class, Integer.class));

        if (!dynMethodType.equals(mh.type())) {
            mh = mh.asType(dynMethodType);
        }

        return new ConstantCallSite(mh);
    }
}