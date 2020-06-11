package com.test;

import java.lang.annotation.*;

/**
 * https://juejin.im/post/587d81295c497d0058b17a16
 */
@Target(value ={ElementType.FIELD})
@Retention(value= RetentionPolicy.RUNTIME)
@Documented
public @interface TestAnnotation {
    String value();
    short age();
}
