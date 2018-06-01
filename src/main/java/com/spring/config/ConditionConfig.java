package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.spring.conditional.WindowsCondition;
import com.spring.conditional.WindowsListService;

/**
 * 条件配置类
 * 
 * @author sanduo
 * @date 2018/05/17
 */
@Configuration
@ComponentScan("com.spring.conditional")
public class ConditionConfig {

    @Bean
    @Conditional(WindowsCondition.class)
    public WindowsListService windowsListService() {
        return new WindowsListService();
    }
}
