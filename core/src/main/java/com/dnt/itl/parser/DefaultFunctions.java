package com.dnt.itl.parser;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * not thread safe because of SimpleDataFormat
 * <p/>
 * User: Mark Zang
 * Date: 2015/4/21
 * Time: 17:10
 */
public class DefaultFunctions {

    public static DefaultFunctions getInstance() {
        return new DefaultFunctions();
    }

    public final String upper(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }


    public final String lower(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase();
    }


    public final String trim(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    /**
     * not thread safe!
     */
    SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    public final String nowStr() {
        Date date = new Date();
        return fmt.format(date);
    }


    public final long now() {
        return System.currentTimeMillis();
    }
}
