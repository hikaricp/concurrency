package com.mmall.concurrency.annoations;

/**
 * 用来标记【线程不安全】的类
 */
public @interface NotThreadSafe {

    String value() default "";
}
