package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.TaskExecutorConfig;
import com.spring.service.taskexecutor.AsyncTaskService;

/**
 * 多线程，异步
 * 
 * @author sanduo
 * @date 2018/05/17
 */
public class AsyncTaskApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
        for (int i = 0; i < 10; i++) {

            asyncTaskService.executorAsyncTask(i);
            asyncTaskService.executorAsyncTaskPlus(i);
        }
        context.close();
    }
}
