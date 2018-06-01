package com.spring.service.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author sanduo
 * @date 2018/05/16
 */
@Component
public class EventListener implements ApplicationListener<DemoEvent> {

    /* 事件监听，处理事件
     * @see org.springframework.context.ApplicationListener#onApplicationEvent(org.springframework.context.ApplicationEvent)
     */
    @Override
    public void onApplicationEvent(DemoEvent event) {

        String msg = event.getMsg();
        System.out.println("我（bean-eventListener）收到了bean-eventPublisher发布的消息：" + msg);
    }

}
