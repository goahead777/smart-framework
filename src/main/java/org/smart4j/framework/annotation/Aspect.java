package org.smart4j.framework.annotation;

import java.lang.annotation.*;

/**
 * 切面类注解
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {
    Class<? extends Annotation> value();
}
