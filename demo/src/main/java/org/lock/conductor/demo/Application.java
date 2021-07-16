package org.lock.conductor.demo;

import org.lock.conductor.autoconfigure.JobProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author liukai
 * @date 2021/7/16
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        JobProperties job = context.getBean(JobProperties.class);
        System.out.println(job);
    }
}
