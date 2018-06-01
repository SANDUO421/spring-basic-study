
package com.spring.service.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 异步多线程
 * 
 * @author sanduo
 * @date 2018/05/17
 */
@Service
public class AsyncTaskService {

    @Async
    public void executorAsyncTask(Integer i) {
        System.out.println("异步执行任务" + i);
    }

    @Async
    public void executorAsyncTaskPlus(Integer i) {
        System.out.println("异步执行任务+1:" + (i + 1));
    }
}
