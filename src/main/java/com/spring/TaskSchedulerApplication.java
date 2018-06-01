package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.TaskSchedulerConfig;
import com.spring.taskschedule.ScheduledTaskService;

/**
 * 计划任务执行类
 * 
 * @author sanduo
 * @date 2018/05/17
 */
@SuppressWarnings("all")
public class TaskSchedulerApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);

        ScheduledTaskService task = context.getBean(ScheduledTaskService.class);
        // task.fixTiemExecution();
        // task.reportCurrentTime();
        // context.close();
    }
}
