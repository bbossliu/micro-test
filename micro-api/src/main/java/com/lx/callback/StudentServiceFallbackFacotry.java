package com.lx.callback;

import com.lx.service.StudentService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author dalaoban
 * @create 2020-09-14-15:51
 */
@Component
public class StudentServiceFallbackFacotry implements FallbackFactory<StudentService> {
    @Override
    public StudentService create(Throwable throwable) {
        return new StudentService() {
            @Override
            public String test01() {
                System.out.println("test01触发熔断");
                return "test01方法发生异常开始熔断";
            }

            @Override
            public String test02() {
                System.out.println("test02方法触发熔断");
                return "test02方法发生异常开始熔断";
            }
        };
    }
}
