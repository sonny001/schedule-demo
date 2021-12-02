package com.example.simple.springSchedule;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

@Service
@Slf4j
@Data
public class SpringScheduleDemo {

    private AtomicInteger taskNumber = new AtomicInteger(0);
    private AtomicInteger task1Number = new AtomicInteger(0);

    @Scheduled(cron = "*/5 * * * * ? ")
    public void remindTask() throws InterruptedException {
        log.info("每隔5秒执行一次, 当前线程名称{} 当前执行次数{}", Thread.currentThread().getName(), taskNumber.incrementAndGet());
    }

    /**
     * 固定频率执行。fixedDelay的单位是ms
     */
    @Scheduled(fixedDelay = 1000)
    public void remindTask2() throws InterruptedException {
        log.info("每隔1s执行一次 当前线程名称{} 当前执行次数{}", Thread.currentThread().getName(), task1Number.incrementAndGet());
    }
}
