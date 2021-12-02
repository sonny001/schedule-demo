package com.example.simple.jdktimer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * JDK Timer 任务调度
 */
public class TestTimer {
    public static void main(String[] args) {
        String dateStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println("任务执行前：" + dateStr);

        Timer timer = new Timer();
        TimerTask task = new TestTimerTask();
        // delay 延时，单位毫秒
        // period 频率，单位毫秒
        timer.schedule(task, 5000L, 1000L);
    }
}
