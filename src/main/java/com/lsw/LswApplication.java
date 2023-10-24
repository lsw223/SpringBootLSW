package com.lsw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@MapperScan("com.lsw.mapper")
@SpringBootApplication
@EnableScheduling
public class LswApplication {

    public static void main(String[] args) {
        SpringApplication.run(LswApplication.class, args);
    }

}
