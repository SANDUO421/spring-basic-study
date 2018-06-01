package com.spring.service.event;

import org.springframework.context.ApplicationEvent;

/**
 * 定义一个事件
 * 
 * @author sanduo
 * @date 2018/05/16
 */
public class DemoEvent extends ApplicationEvent {

    /**
     *
     */
    private static final long serialVersionUID = -8782555440793921913L;

    private String msg;

    /**
     * 
     * @param source
     */
    public DemoEvent(Object source) {
        super(source);
    }

    /**
     * @param source
     * @param msg
     */
    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg the msg to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

}
