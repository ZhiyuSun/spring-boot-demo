package com.zhiyu.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhiyu.springboot.dao")
public class SpringbootApplication {

    public static void main(String[] args) {
        System.out.println("启动 Spring Boot...");
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
