package org.smart4j.framework.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropsUtil {
    /**
     * 加载属性文件
     * @param fileName
     * @return
     */
    public static Properties loadProps(String fileName){
        Properties props = null;
        InputStream is = null;
        try {
            is = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
            if(is == null){
                throw new FileNotFoundException(fileName + "file is not found");
            }
            props = new Properties();
            props.load(is);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return props;
    }

    /**
     * 加载字符串类型
     * @param props
     * @param key
     * @return
     */
    public static String getString(Properties props, String key){
        return getString(props, key, "");
    }

    public static String getString(Properties props, String key, String defaultValue){
        String value = defaultValue;
        if(props.contains(key)){
            value = props.getProperty(key);
        }
        return value;
    }

    /**
     * 加载整数类型
     * @param props
     * @param key
     * @return
     */
    public static int getInt(Properties props, String key){
        return getInt(props, key, 0);
    }

    /**
     * 加载布尔类型
     * @param props
     * @param key
     * @param defaultValue
     * @return
     */
    public static int getInt(Properties props, String key, int defaultValue){
        int value = defaultValue;
        if(props.contains(key)){
            value = CastUtil.castInt(props.getProperty(key));
        }
        return value;
    }
    public static boolean getBoolean(Properties props, String key){
        return getBoolean(props, key, false);
    }

    public static boolean getBoolean(Properties props, String key, boolean defaultValue){
        boolean value = defaultValue;
        if(props.contains(key)){
            value = CastUtil.castBoolean(props.getProperty(key));
        }
        return value;
    }
}
