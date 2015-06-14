package com.dnt.itl.parser;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

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

    public final String timeStr(Number time) {
        Date date = new Date(time.longValue());
        return fmt.format(date);
    }


    public final long now() {
        return System.currentTimeMillis();
    }

    public final Map maxOnFirst(List<Object[]> rows) {
        if (rows == null || rows.isEmpty()) {
            return Collections.emptyMap();
        }

        Comparable max = null;
        Object[] value = null;

        for (Object[] row : rows) {
            if (max == null || (max.compareTo(row[0]) < 0)) {
                max = (Comparable) row[0];
                value = row;
            }
        }

        Map ret = Collections.singletonMap(max, value);
        return ret;
    }

    public final Map minOnFirst(List<Object[]> rows) {
        if (rows == null || rows.isEmpty()) {
            return Collections.emptyMap();
        }

        Comparable min = null;
        Object[] value = null;

        for (Object[] row : rows) {
            if (min == null || (min.compareTo(row[0]) > 0)) {
                min = (Comparable) row[0];
                value = row;
            }
        }

        Map ret = Collections.singletonMap(min, value);
        return ret;
    }

    public final double sum(List<Object[]> rows) {
        if (rows == null || rows.isEmpty()) {
            return 0;
        }

        double var = 0;

        for (Object[] row : rows) {
            Number number = (Number) row[0];
            var += number.doubleValue();
        }

        return var;
    }

}
