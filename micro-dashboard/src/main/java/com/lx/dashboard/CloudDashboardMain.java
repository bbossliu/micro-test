package com.lx.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author dalaoban
 * @create 2020-09-14-16:08
 */
@SpringBootApplication
@EnableHystrixDashboard
public class CloudDashboardMain {
    public static void main(String[] args) {
        SpringApplication.run(CloudDashboardMain.class,args);
    }
}
