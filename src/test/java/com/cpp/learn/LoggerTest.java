package com.cpp.learn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StopWatch;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoggerTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(LearnSomeApplication.class);

    //获取指定名称的logger
    private static final Logger LOGGER_HEALTH = LoggerFactory.getLogger("health_logger");


    @Test
    public void contextLoads() {
        StopWatch stopWatch = new StopWatch();

        stopWatch.start("log1");
        int loop = 100000;
        for (int i = 0; i < loop; i++) {
            LOGGER.info("application started");
        }
        stopWatch.stop();

        stopWatch.start("log2");
        for (int i = 0; i < loop; i++) {
            LOGGER_HEALTH.info("app started");
        }
        stopWatch.stop();

        System.out.println(stopWatch.prettyPrint());
    }
}
