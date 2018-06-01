package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.EventConfig;
import com.spring.service.event.EventPublisher;

/**
 * 事件
 * 
 * @author sanduo
 * @date 2018/05/16
 */
public class EventApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        EventPublisher publisher = context.getBean(EventPublisher.class);
        publisher.publish("请发一条短信");
        context.close();
    }
}
