package com.yu.bs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author HuangYu
 * @create 2019/7/17
 * @since 1.0.0
 */
@EnableHystrixDashboard
@SpringBootApplication
public class HystrixDashboard {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboard.class, args);
    }
}