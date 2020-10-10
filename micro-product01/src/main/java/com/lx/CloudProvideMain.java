package com.lx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author dalaoban
 * @create 2020-06-27-17:14
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class CloudProvideMain {
    public static void main(String[] args) {
        SpringApplication.run(CloudProvideMain.class,args);
    }
}
