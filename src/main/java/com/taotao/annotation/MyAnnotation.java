package com.taotao.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//此注解左右的范围     例如：方法  类   参数
@Target(value = {ElementType.METHOD})
//此注解的作用范围      运行时
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
public @interface MyAnnotation
{
    String value();
    
}
