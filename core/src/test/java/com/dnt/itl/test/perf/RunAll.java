package com.dnt.itl.test.perf;

/**
 * User: Mark Zang
 * Date: 2015/4/28
 * Time: 13:07
 */
public class RunAll {
    public static void main(String[] args) {
        String count = args.length == 1 ? args[0] : null;
        args = new String[]{count, null, null, null, null, null};
        System.out.println("perfmark col,direct tps, direct twice tps, reflect tps, direct twice/direct, direct/reflect");
        for (int i = 0; i < 100; i++) {
            System.out.println("=======return var and DON't USE ret var========");
            ReflectPerfTest.main(args);
            System.out.println("case1 finished");
            System.out.println("perfmark no use ret," + args[1] + "," + args[2] + "," + args[3] + "," + args[4] + "," + args[5]);
            System.out.println();


            System.out.println("=======return var and USE return var W/O box operation ========");
            ReflectPerfTestUseRet.main(args);
            System.out.println("case2 finished");
            System.out.println("perfmark use int," + args[1] + "," + args[2] + "," + args[3] + "," + args[4] + "," + args[5]);
            System.out.println();

            System.out.println("=======return var and USE return var HAS box operation ========");
            ReflectPerfTestUseRetBox.main(args);
            System.out.println("case3 finished");
            System.out.println("perfmark use Integer," + args[1] + "," + args[2] + "," + args[3] + "," + args[4] + "," + args[5]);
            System.out.println();

            System.out.println("=======return var and USE return var W/O operation -- for long========");
            ReflectPerfTestUseRetLong.main(args);
            System.out.println("case4 finished");
            System.out.println("perfmark use long," + args[1] + "," + args[2] + "," + args[3] + "," + args[4] + "," + args[5]);
            System.out.println();

            System.out.println("=======return var and USE return var HAS box operation -- for long========");
            ReflectPerfTestUseRetBoxLong.main(args);
            System.out.println("case5 finished");
            System.out.println("perfmark use Long," + args[1] + "," + args[2] + "," + args[3] + "," + args[4] + "," + args[5]);
            System.out.println();

            System.out.println("=======return var and USE return var HAS box operation -- for long, this time the return value is Long (one less box operation) ========");
            ReflectPerfTestUseRetBoxLong2.main(args);
            System.out.println("case6 finished");
            System.out.println("perfmark use Long2," + args[1] + "," + args[2] + "," + args[3] + "," + args[4] + "," + args[5]);
            System.out.println();

            System.out.println("=======return var and USE return var HAS box operation -- and this time there is logic");
            ReflectPerfTestUseRetBoxLong.main(args);
            System.out.println("case7 finished");
            System.out.println("perfmark use Long logic," + args[1] + "," + args[2] + "," + args[3] + "," + args[4] + "," + args[5]);
            System.out.println();

            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        }
    }
}
