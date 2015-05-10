package com.dnt.itl.parser;

/**
 * User: Mark Zang
 * Date: 2015/4/21
 * Time: 15:54
 */
public class LogFacade {

    public static boolean debug = false;

    public static final void log(Object msg) {
        if (!debug) {
            System.out.println(msg);
        }
    }

    /**
     * log no new line
     *
     * @param msg
     */
    public static final void logNNL(Object msg) {
        if (!debug) {
            System.out.print(msg);
        }
    }
}
