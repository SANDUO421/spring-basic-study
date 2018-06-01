package com.spring.taskschedule;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * 任务
 * 
 * @author sanduo
 * @date 2018/05/17
 */
@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("每隔5秒执行一次" + DATE_FORMAT.format(new Date()));

    }

    @Scheduled(cron = "0 37 9 ? * *") // 每天9点30
    public void fixTiemExecution() {
        System.out.println("在指定时间" + DATE_FORMAT.format(new Date()) + "执行");
    }
}
