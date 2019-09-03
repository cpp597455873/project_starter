package com.cpp.learn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
})
@MapperScan(" com.cpp.learn.dao")
public class LearnSomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnSomeApplication.class, args);
    }

}
