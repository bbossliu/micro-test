package com.lx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author dalaoban
 * @create 2020-09-08-16:53
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.lx.service"})
//@ComponentScan("com.lx")
public class CloudConsumerFeign {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerFeign.class,args);
    }
}
