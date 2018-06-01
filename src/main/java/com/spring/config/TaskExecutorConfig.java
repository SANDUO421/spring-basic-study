package com.spring.config;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * 多线程编程
 * 
 * @author sanduo
 * @date 2018/05/16
 */
@ComponentScan("com.spring.service.taskexecutor")
@Configuration
@EnableAsync // 开启异步任务支持
public class TaskExecutorConfig implements AsyncConfigurer {

    /* 获取异步执行器
     * @see org.springframework.scheduling.annotation.AsyncConfigurer#getAsyncExecutor()
     */
    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setMaxPoolSize(10);
        executor.setCorePoolSize(5);
        executor.setQueueCapacity(25);
        executor.initialize();
        return null;
    }

    /* 未捕获的异常处理类
     * @see org.springframework.scheduling.annotation.AsyncConfigurer#getAsyncUncaughtExceptionHandler()
     */
    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }

}
