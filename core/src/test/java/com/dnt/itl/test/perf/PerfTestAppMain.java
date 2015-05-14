package com.dnt.itl.test.perf;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

/**
 * User: Mark Zang
 * Date: 2015/4/28
 * Time: 13:00
 */
public class PerfTestAppMain {

    String strVar = String.valueOf(System.currentTimeMillis());

    public String getStrVar() {
        return strVar;
    }

    static int count = 1024 * 1024 * 16;

    public static void main(String[] args) throws Throwable {
        ref();
        mhInvoke();
        mhInvokeConvert();
        mhInvokeExact();
        invoke();

        System.out.println();
        System.out.println();

        ref();
        mhInvoke();
        mhInvokeConvert();
        mhInvokeExact();
        invoke();
    }

    static void ref() throws Throwable {
        PerfTestAppMain bean = new PerfTestAppMain();

        Method ref = PerfTestAppMain.class.getMethod("getStrVar");

        Object ret = null;

        long start = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            ret = ref.invoke(bean);
        }

        long end = System.currentTimeMillis();

        System.out.println("Ref tpms = " + ((count) / (end - start)));

    }

    static void mhInvoke() throws Throwable {
        PerfTestAppMain bean = new PerfTestAppMain();

        MethodHandle mh = MethodHandles.lookup().findVirtual(
                PerfTestAppMain.class,
                "getStrVar",
                MethodType.methodType(String.class))
                .bindTo(bean);

        Object ret = null;

        long start = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            ret = mh.invoke();
        }

        long end = System.currentTimeMillis();

        System.out.println("mh invoke tpms = " + ((count) / (end - start)));
    }

    static void mhInvokeConvert() throws Throwable {
        PerfTestAppMain bean = new PerfTestAppMain();

        MethodHandle mh = MethodHandles.lookup().findVirtual(
                PerfTestAppMain.class,
                "getStrVar",
                MethodType.methodType(String.class))
                .bindTo(bean);

        String ret = null;

        long start = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            ret = (String) mh.invoke();
        }

        long end = System.currentTimeMillis();

        System.out.println("mh invoke with convert tpms = " + ((count) / (end - start)));
    }

    static void mhInvokeExact() throws Throwable {
        PerfTestAppMain bean = new PerfTestAppMain();

        MethodHandle mh = MethodHandles.lookup().findVirtual(
                PerfTestAppMain.class,
                "getStrVar",
                MethodType.methodType(String.class));

        String ret = null;

        long start = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            ret = (String) mh.invokeExact(bean);
        }

        long end = System.currentTimeMillis();

        System.out.println("mh invoke exact tpms = " + ((count) / (end - start)));
    }

    static void invoke() throws Throwable {
        PerfTestAppMain bean = new PerfTestAppMain();

        long start = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            bean.getStrVar();
        }

        long end = System.currentTimeMillis();

        System.out.println("invoke directly tpms = " + ((count) / (end - start + 1)));
    }


}
