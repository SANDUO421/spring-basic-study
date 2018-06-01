package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.conditional.ListService;
import com.spring.config.ConditionConfig;

/**
 * 条件
 * 
 * @author sanduo
 * @date 2018/05/17
 */
public class ConditionalApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);

        ListService listService = context.getBean(ListService.class);

        System.out.println(context.getEnvironment().getProperty("os.name") + "系统下的列表命令为：" + listService.showListCmd());
        context.close();

    }

}
