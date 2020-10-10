package com.lx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author dalaoban
 * @create 2020-09-08-16:26
 */
@RestController
public class StudentController {

    public static final String URL_PREFIX = "http://product";

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("test01")
    public String test01(){
        return restTemplate.getForObject(URL_PREFIX+"/test01",String.class);
    }

}
