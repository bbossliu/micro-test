package com.lx.controller;

import com.lx.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dalaoban
 * @create 2020-09-08-16:51
 */
@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("test01")
    public String test01(){
        return studentService.test01();
    }

    @RequestMapping("test02")
    public String test02(){
        return studentService.test02();
    }
}
