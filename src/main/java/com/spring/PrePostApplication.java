package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.PrePostConfig;
import com.spring.prepost.BeanWayService;
import com.spring.prepost.JSR250WayService;

/**
 * prepost：初始化和销毁
 * 
 * @author sanduo
 * @date 2018/05/16
 */
@SuppressWarnings("unused")
public class PrePostApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);

        BeanWayService bean = context.getBean(BeanWayService.class);
        JSR250WayService jsr250 = context.getBean(JSR250WayService.class);
        context.close();
    }
}
