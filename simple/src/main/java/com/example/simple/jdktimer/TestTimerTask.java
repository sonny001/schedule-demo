package com.example.simple.jdktimer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

/**
 * JDK Timer 任务执行
 */
public class TestTimerTask extends TimerTask {
    /**
     * 此计时器任务要执行的操作。
     */
    public void run() {
        Date executeTime = new Date(this.scheduledExecutionTime());
        String dateStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(executeTime);
        System.out.println("任务执行了：" + dateStr);
    }
}
