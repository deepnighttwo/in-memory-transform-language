package com.dnt.itl.parser;

/**
 * User: Mark Zang
 * Date: 2015/4/21
 * Time: 16:12
 */
public class ComputeUtils {

    public static final int NOTNUMBER = -1;
    public static final int TYPE_MASK = 0xF0;
    public static final int INT_NUM = 0x10;
    public static final int FLOAT_NUM = 0x20;
    public static final int BYTE = 0x11;
    public static final int SHORT = 0x12;
    public static final int INT = 0x13;
    public static final int LONG = 0x14;
    public static final int FLOAT = 0x21;
    public static final int DOUBLE = 0x22;

    public static int getType(Object obj) {
        Class clazz = obj.getClass();

        if (clazz == Byte.class || clazz == byte.class) {
            return BYTE;
        }

        if (clazz == Short.class || clazz == short.class) {
            return SHORT;
        }

        if (clazz == Integer.class || clazz == int.class) {
            return INT;
        }

        if (clazz == Long.class || clazz == long.class) {
            return LONG;
        }

        if (clazz == Float.class || clazz == float.class) {
            return FLOAT;
        }

        if (clazz == Double.class || clazz == double.class) {
            return DOUBLE;
        }

        return NOTNUMBER;

        //TODO: BigDecimal support?
    }


}
