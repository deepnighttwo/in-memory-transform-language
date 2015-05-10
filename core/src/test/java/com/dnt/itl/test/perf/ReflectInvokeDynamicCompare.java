package com.dnt.itl.test.perf;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;

/**
 * User: Mark Zang
 * Date: 2015/5/3
 * Time: 19:16
 */
public class ReflectInvokeDynamicCompare {

    static int count = 1024 * 100;

    public static void main(String[] args) throws Throwable {

        PerfTestBean data = new PerfTestBean();

        Method method = PerfTestBean.class.getMethod("getStrvar");

        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            method.invoke(data);
        }
        System.out.println(count / (System.currentTimeMillis() - start + 1));


        MethodHandles.Lookup lookup = MethodHandles.lookup();

        MethodHandle methodHandle = lookup.unreflect(method);
        methodHandle.invoke(data);

        start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            methodHandle.invoke(data);
        }
        System.out.println(count / (System.currentTimeMillis() - start));


        start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            String s = (String) methodHandle.invokeExact(data);
//            Object obj = methodHandle.invokeWithArguments(data);
        }
        System.out.println(count / (System.currentTimeMillis() - start));


        start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            String s = data.getStrvar();
        }
        System.out.println(count / (System.currentTimeMillis() - start + 1));


    }
}
