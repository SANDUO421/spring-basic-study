package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.annotation.AnnotationConfig;
import com.spring.annotation.AnnotationService;

/**
 * 自定义组合注解
 * 
 * @author sanduo
 * @date 2018/05/17
 */
public class AnnotationApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);

        AnnotationService annotationService = context.getBean(AnnotationService.class);

        annotationService.outputResult();

        context.close();
    }
}
