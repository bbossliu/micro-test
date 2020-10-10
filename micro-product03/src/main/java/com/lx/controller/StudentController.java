package com.lx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dalaoban
 * @create 2020-09-08-16:12
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
    public String test01(){
        return "product03";
    }

}
