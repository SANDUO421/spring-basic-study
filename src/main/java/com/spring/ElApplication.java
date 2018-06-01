package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.ElConfig;

/**
 * el
 * 
 * @author sanduo
 * @date 2018/05/16
 */
public class ElApplication {

    public static void main(String[] args) {
        // XXX 这个案例运行有误
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig elConfig = context.getBean(ElConfig.class);
        elConfig.outputResource();
        context.close();
    }
}
