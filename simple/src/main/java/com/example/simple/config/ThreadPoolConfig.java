package com.example.simple.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ScheduledExecutorFactoryBean;

// 配置线程池
@Configuration
public class ThreadPoolConfig {

    @Bean
    public ScheduledExecutorFactoryBean scheduledExecutorFactoryBean() {
        ScheduledExecutorFactoryBean factoryBean = new ScheduledExecutorFactoryBean();
        factoryBean.setPoolSize(20);
        factoryBean.setThreadNamePrefix("i'm time task thread - ");
        return factoryBean;
    }

}