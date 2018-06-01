package com.spring.annotation;

import org.springframework.stereotype.Service;

/**
 * 使用自定义注解
 * 
 * @author sanduo
 * @date 2018/05/17
 */
@Service
public class AnnotationService {
    public void outputResult() {
        System.out.println("从组合注解获取bean");
    }
}
