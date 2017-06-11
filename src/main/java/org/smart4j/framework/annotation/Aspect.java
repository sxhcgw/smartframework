package org.smart4j.framework.annotation;

import java.lang.annotation.*;

/**
 * Created by sxhcgw on 2017/6/11.
 */

@Target(ElementType.TYPE)   //接口、类、枚举、注解
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {

    Class<? extends Annotation> value();
}
