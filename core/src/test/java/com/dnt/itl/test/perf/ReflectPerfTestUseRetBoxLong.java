package com.dnt.itl.test.perf;


import java.lang.reflect.Method;

/**
 * User: Mark Zang
 * Date: 2015/4/27
 * Time: 18:03
 */
public class ReflectPerfTestUseRetBoxLong {

    static int count = 1024 * 1024 * 500;

    public static void main(String[] args) {

        if (args.length > 1 && args[0] != null) {
            count = Integer.parseInt(args[0]);
        }

        System.out.println("loop count is " + count);

        long directTPS = directCall(count);
        /**
         * if indeed there is some optimise in the loop, the following tps should be much bigger than above, right?
         */
        long directTPST = directCall(count * 2);
        long reflectTPS = reflectCall();
        System.out.printf("direct call tps %d, direct call twice tps %d, reflect tps %d", directTPS, directTPST, reflectTPS);
        System.out.println();
        System.out.println("direct call twice is " + (directTPST * 1.0 / directTPS) + " times faster than reflect");
        System.out.println("direct call is " + (directTPS / reflectTPS) + " times faster than reflect");


        if (args.length == 6) {
            args[1] = "" + directTPS;
            args[2] = "" + directTPST;
            args[3] = "" + reflectTPS;
            args[4] = "" + (directTPST * 1.0 / directTPS);
            args[5] = "" + (directTPS / reflectTPS);
        }
    }

    static long directCall(long count) {
        long sum = 0;
        try {
            PerfTestBean data = new PerfTestBean();
            long start = System.currentTimeMillis();
            for (int i = 0; i < count; i++) {
                sum += data.perfTestUseRetBoxLong();
            }
            long end = System.currentTimeMillis();
            long tps = (count / (end - start));
            System.out.println("direct call tps=" + tps);
            return tps;
        } catch (Throwable ex) {
            System.out.println(sum);
        }
        return -1;
    }

    static long reflectCall() {
        long sum = 0;
        try {
            PerfTestBean data = new PerfTestBean();
            Method method = PerfTestBean.class.getMethod("perfTestUseRetBoxLong");
            long start = System.currentTimeMillis();
            for (int i = 0; i < count; i++) {
                sum += (long) method.invoke(data);
            }
            long end = System.currentTimeMillis();
            long tps = (count / (end - start));
            System.out.println("reflect call tps=" + tps);
            return tps;
        } catch (Exception ex) {
            System.out.println(sum);
        }
        return -1;
    }


}
