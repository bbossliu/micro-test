package com.lx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author dalaoban
 * @create 2020-09-08-16:31
 */

@SpringBootApplication
@EnableEurekaClient
public class CloudConsumerMain {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerMain.class,args);
    }
}
