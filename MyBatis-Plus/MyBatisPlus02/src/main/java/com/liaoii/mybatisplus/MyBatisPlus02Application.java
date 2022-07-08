package com.liaoii.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.liaoii.mybatisplus.mapper")
public class MyBatisPlus02Application {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisPlus02Application.class, args);
    }

}
