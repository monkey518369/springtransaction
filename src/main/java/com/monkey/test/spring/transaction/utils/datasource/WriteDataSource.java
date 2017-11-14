package com.monkey.test.spring.transaction.utils.datasource;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author:monkey
 * @Description:
 * @Date: Create in 23:54 2017/11/13
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface WriteDataSource {

    String value();
}
