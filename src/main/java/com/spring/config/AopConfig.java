package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * aop配置类
 * 
 * @author sanduo
 * @date 2018/05/16
 */
@Configuration
@ComponentScan("com.spring.service.aop")
@EnableAspectJAutoProxy // 开启spring对aspectj的支持
public class AopConfig {

}
