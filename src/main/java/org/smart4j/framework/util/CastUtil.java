package org.smart4j.framework.util;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * 转型工作操作类
 */
public class CastUtil {

    public static String castString(Object object) {
        return castString(object, "");
    }

    public static String castString(Object object, String defaultValue) {
        return object == null ? defaultValue : String.valueOf(object);
    }

    public static double castDouble(Object object) {
        return castDouble(object, 0);
    }

    public static double castDouble(Object object, double defaultValue) {
        double res = defaultValue;
        if (object != null) {
            String tmp = castString(object);
            if (StringUtil.isNotBlank(tmp)) {
                try {
                    res = Double.parseDouble(tmp);
                } catch (Exception e) {
                    res = defaultValue;
                }
            }
        }
        return res;
    }

    public static Long castLong(Object object) {
        return castLong(object, 0L);
    }

    public static Long castLong(Object object, long defaultValue) {
        long res = defaultValue;
        if (object != null) {
            String tmp = castString(object);
            if (StringUtil.isNotBlank(tmp)) {
                try {
                    res = Long.parseLong(tmp);
                } catch (Exception e) {
                    res = defaultValue;
                }
            }
        }
        return res;
    }

    public static int castInt(Object object) {
        return castInt(object, 0);
    }

    public static int castInt(Object object, int defaultValue) {
        int res = defaultValue;
        if (object != null) {
            String tmp = castString(object);
            if (StringUtil.isNotBlank(tmp)) {
                try {
                    res = Integer.parseInt(tmp);
                } catch (Exception e) {
                    res = defaultValue;
                }
            }
        }
        return res;
    }

    public static boolean castBoolean(Object object){
        return castBoolean(object, false);
    }

    public static boolean castBoolean(Object object, Boolean defaultValue){
        boolean res = defaultValue;
        if(object!=null){
            String tmp = castString(object);
            res = Boolean.parseBoolean(tmp);
        }
        return res;
    }

    public static void main(String[] args) {
        String a = "true";
        System.out.println(Boolean.parseBoolean(a));
    }

}
