package com.spring.service.aop;

import org.springframework.stereotype.Service;

/**
 * aop 注解被拦截的类
 * 
 * @author sanduo
 * @date 2018/05/16
 */
@Service
// public class AopAnnotationServiceImpl implements AopService {
public class AopAnnotationServiceImpl {
    /* 被拦截的方法
     * @see com.spring.service.AopService#add()
     */
    // @Override
    @Action(name = "注解式拦截的add操作")
    public void add() {
        // System.out.println("注解式拦截的add操作");

    }

}
