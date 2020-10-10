package com.lx.service;

import com.lx.callback.StudentServiceFallbackFacotry;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author dalaoban
 * @create 2020-09-08-16:42
 */
//被调用者在Eureka中注册的微服务名是cloud-provider
@FeignClient(value = "product",fallbackFactory = StudentServiceFallbackFacotry.class)
public interface StudentService {

    @RequestMapping(value = "test01",method = RequestMethod.GET)
    String test01();

    @RequestMapping(value = "test02",method = RequestMethod.GET)
    String test02();

//    String test01(Student student);  也可以放入参数

}
