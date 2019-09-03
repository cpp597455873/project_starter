package com.cpp.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
})
public class LearnSomeApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(LearnSomeApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LearnSomeApplication.class, args);
        LOGGER.error("application started");
    }

}
