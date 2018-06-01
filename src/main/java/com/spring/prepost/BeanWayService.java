package com.spring.prepost;

/**
 * @Bean的方式
 * @author sanduo
 * @date 2018/05/16
 */
public class BeanWayService {

    /**
     * 
     */
    public void init() {
        System.out.println("初始化@Bean-init-method");

    }

    /**
     * 
     */
    public BeanWayService() {
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }

    public void destory() {
        System.out.println("销毁@Bean-destory-method");

    }

}
