package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.GlobalConfig;
import com.spring.service.UserService;

/**
 * 启动类
 * 
 * @author sanduo
 * @date 2018/05/16
 */
public class Application {
    public static void main(String[] args) {
        // 接受配置类
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GlobalConfig.class);

        UserService userService = context.getBean(UserService.class);
        String result = userService.saySpring("Spring ");
        System.out.println(result);
        System.out.println("---------------------");
        context.close();
    }

}
