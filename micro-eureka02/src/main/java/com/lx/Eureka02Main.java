package com.lx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author dalaoban
 * @create 2020-06-27-18:14
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka02Main {
    public static void main(String[] args) {
        SpringApplication.run(Eureka02Main.class,args);
    }
}
