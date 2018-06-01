package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * 全局配置类
 * 
 * @author sanduo
 * @date 2018/05/16
 */
@Component // 声明当前类是一个配置类
@ComponentScan("com.spring") // 注解扫描
public class GlobalConfig {

}
