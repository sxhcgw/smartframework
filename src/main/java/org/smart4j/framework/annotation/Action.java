package org.smart4j.framework.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by sxhcgw on 2017/5/31.
 */

@Target(ElementType.TYPE)   //用于描述类、接口(包括注解类型) 或enum声明
@Retention(RetentionPolicy.RUNTIME) //RUNTIME:在运行时有效（即运行时保留）
public @interface Action {

    /**
     * 请求类型与路径
     */
    String value();
}
