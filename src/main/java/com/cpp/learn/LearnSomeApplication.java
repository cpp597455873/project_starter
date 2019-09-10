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

    //获取指定名称的logger
    private static final Logger LOGGER_HEALTH = LoggerFactory.getLogger("health_logger");

    public static void main(String[] args) {
        SpringApplication.run(LearnSomeApplication.class, args);
        LOGGER.error("application started");
        LOGGER_HEALTH.info("app started");
    }

}
