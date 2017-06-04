package org.smart4j.framework.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by sxhcgw on 2017/5/28.
 */
public class StringUtil {

    public  static boolean isEmpty(String str){
        if(str != null){
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }

    public static String[] splitString(String str, String ch){
        return StringUtils.split(str, ch);
    }
}
