package com.spring.service.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * 日志的切面
 * 
 * @author sanduo
 * @date 2018/05/16
 */
@Aspect // 声明一个切面
@Component // 把切面交由spring容器管理
public class LogAspect {

    // 注解声明切点
    @Pointcut("@annotation(com.spring.service.aop.Action)")
    public void annotationPointCut() {};

    // 后置通知
    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截：" + action.name());
    }

    @Before("execution(* com.spring.service.aop.AopMethodServiceImpl.*(..))")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则是拦截：" + method.getName());
    }
}
