package com.yu.bs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author HuangYu
 * @create 2019/7/16
 * @since 1.0.0
 */

@EnableEurekaClient
@SpringBootApplication
public class TokenServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(TokenServiceApplication.class, args);
    }
}