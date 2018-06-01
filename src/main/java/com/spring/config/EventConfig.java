package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 事件发布者配置类
 * 
 * @author sanduo
 * @date 2018/05/16
 */
@Configuration
@ComponentScan("com.spring.service.event")
public class EventConfig {

}
