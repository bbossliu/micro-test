package com.lx.Zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author dalaoban
 * @create 2020-09-14-16:32
 */
@SpringBootApplication
@EnableZuulProxy
public class CloudZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudZuulApplication.class,args);
    }
}
