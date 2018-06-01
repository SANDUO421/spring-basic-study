package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.prepost.BeanWayService;
import com.spring.prepost.JSR250WayService;

/**
 * 初始化和销毁
 * 
 * @author sanduo
 * @date 2018/05/16
 */
@ComponentScan("com.spring.service.prepost")
@Configuration
public class PrePostConfig {

    @Bean(initMethod = "init", destroyMethod = "destory")
    public BeanWayService beanWayService() {
        return new BeanWayService();
    }

    @Bean
    public JSR250WayService jSR250WayService() {
        return new JSR250WayService();
    }

}
