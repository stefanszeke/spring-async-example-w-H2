package com.example.springasync.config;

import java.util.concurrent.Executor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@EnableAsync
public class AsyncConfig {

  @Bean(name = "threadPoolTaskExecutorA")
  public Executor threadPoolTaskExecutor1() { // responsible for executing the task asynchronously
    ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
    executor.setCorePoolSize(3); // number of core threads to keep in the pool, even if they are idle
    executor.setMaxPoolSize(8); // maximum number of threads that can be created
    executor.setQueueCapacity(100); // maximum number of tasks that can be queued
    executor.setThreadNamePrefix("threadPoolTaskExecutorA-"); // prefix for the thread names
    executor.initialize();
    return executor;
  }
  
}
