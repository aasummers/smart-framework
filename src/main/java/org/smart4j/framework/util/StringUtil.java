package org.smart4j.framework.util;
import org.apache.commons.lang3.StringUtils;

public class StringUtil {
    public static boolean isBlank(String str){
        return StringUtils.isBlank(str);
    }

    public static boolean isNotBlank(String str){
        return !isBlank(str);
    }
}
