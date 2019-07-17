package com.yu.bs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author HuangYu
 * @create 2019/7/17
 * @since 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.yu.bs.dao")
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }
}