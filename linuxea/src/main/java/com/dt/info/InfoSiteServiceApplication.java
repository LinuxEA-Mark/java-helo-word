package com.dt.info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

/**
 * @author Roy
 * @Description 项目启动类
 */
@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = {"com.dt.info"})
public class InfoSiteServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfoSiteServiceApplication.class, args);
	}

	@Bean
	public ThreadPoolTaskScheduler getThreadPoolTaskScheduler(){
		ThreadPoolTaskScheduler threadPoolTaskScheduler = new ThreadPoolTaskScheduler();
		threadPoolTaskScheduler.initialize();
		return threadPoolTaskScheduler;
	}
}