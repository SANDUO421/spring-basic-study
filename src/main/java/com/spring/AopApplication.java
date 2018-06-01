package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.AopConfig;
import com.spring.service.aop.AopAnnotationServiceImpl;
import com.spring.service.aop.AopMethodServiceImpl;

/**
 * @author sanduo
 * @date 2018/05/16
 */
public class AopApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        AopAnnotationServiceImpl aopAnnotationService = context.getBean(AopAnnotationServiceImpl.class);
        AopMethodServiceImpl aopMethodService = context.getBean(AopMethodServiceImpl.class);

        aopAnnotationService.add();
        aopMethodService.add();
        context.close();

    }
}
