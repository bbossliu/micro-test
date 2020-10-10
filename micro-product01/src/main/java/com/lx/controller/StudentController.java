package com.lx.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dalaoban
 * @create 2020-06-27-17:42
 */
@RestController
public class StudentController {

    @Autowired
    DiscoveryClient client;

    @RequestMapping("student/discovery")
    public Object discovery(){
        StringBuilder sb = new StringBuilder();

        client.getServices().forEach((serviceId)->{
            client.getInstances(serviceId).forEach((instance)->{
                sb.append("serviceId：");
                sb.append(instance.getServiceId());
                sb.append("<br/>host：");
                sb.append(instance.getHost());
                sb.append("<br/>port：");
                sb.append(instance.getPort());
                sb.append("<br/>metadata：");
                sb.append(instance.getMetadata());
                sb.append("<br/>uri：");
                sb.append(instance.getUri());
            });
        });
        return sb;
    }


    @RequestMapping("test01")
    //如果发生异常就自动跳到fallbackMethod后面的方法名后
    @HystrixCommand(fallbackMethod = "hystrixMethod")
    public String test01(){
        int a = 1/0;
        return "product01";
    }

    public String hystrixMethod(){
        return "发生异常开始熔断！";
    }

    @RequestMapping("test02")
    public String test02(){
        return "product01-test02";
    }
}
