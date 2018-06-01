package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 任务配置类
 * 
 * @author sanduo
 * @date 2018/05/17
 */
@Configuration
@ComponentScan("com.spring.taskschedule")
@EnableScheduling // 开启计划任务支持
public class TaskSchedulerConfig {

}
