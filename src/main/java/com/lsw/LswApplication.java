package com.lsw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.lsw.mapper")
@SpringBootApplication()
public class LswApplication {

    public static void main(String[] args) {
        SpringApplication.run(LswApplication.class, args);
    }

}
