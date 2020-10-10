package com.lx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author dalaoban
 * @create 2020-09-08-19:09
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudProvideMain03 {
    public static void main(String[] args) {
        SpringApplication.run(CloudProvideMain03.class,args);
    }
}
