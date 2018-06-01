package com.spring.config;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义组合注解
 * 
 * @author sanduo
 * @date 2018/05/17
 */
@Target(value = ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration // 组合元注解
@ComponentScan
public @interface OwnConfiguration {

    String[] value() default {}; // 覆盖value参数

}
