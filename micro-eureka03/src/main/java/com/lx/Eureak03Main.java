package com.lx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author dalaoban
 * @create 2020-06-27-18:15
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureak03Main {
    public static void main(String[] args) {
        SpringApplication.run(Eureak03Main.class,args);
    }
}
