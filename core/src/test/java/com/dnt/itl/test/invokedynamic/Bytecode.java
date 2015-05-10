package com.dnt.itl.test.invokedynamic;

import com.dnt.itl.test.perf.PerfTestBean;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * User: Mark Zang
 * Date: 2015/5/4
 * Time: 9:06
 */
public class Bytecode {

    static MethodHandles.Lookup lookup = MethodHandles.lookup();

    public static void main(String[] args) throws Throwable {
        MethodHandle mh = lookup.findVirtual(PerfTestBean.class, "perfTestUseRet", MethodType.methodType(int.class));

        PerfTestBean perfTestBean = new PerfTestBean();
        mh.invoke(perfTestBean);

        mh.invokeExact(perfTestBean);

    }

}
