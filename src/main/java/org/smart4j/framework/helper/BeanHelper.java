package org.smart4j.framework.helper;

import org.smart4j.framework.util.ReflectionUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by sxhcgw on 2017/6/1.
 */
public final class BeanHelper {

    private static final Map<Class<?>, Object> BEAN_MAP = new HashMap<Class<?>, Object>();
    static {
        Set<Class<?>> beanClassSet = ClassHelper.getBeanClassSet();
        for(Class<?> beanClass : beanClassSet){
            Object obj = ReflectionUtil.newInstance(beanClass);
            BEAN_MAP.put(beanClass, obj);
        }
    }

    public static Map<Class<?>, Object> getBeanMap(){
        return BEAN_MAP;
    }

    public static <T> T getBean(Class<T> cls){
        if(!BEAN_MAP.containsKey(cls)){
            throw new RuntimeException("can not get bean by class: " + cls);
        }
        return (T) BEAN_MAP.get(cls);
    }


}
