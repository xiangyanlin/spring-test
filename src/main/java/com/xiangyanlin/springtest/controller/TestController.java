package com.xiangyanlin.springtest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiangyanlin
 * @date 2021/4/27
 */
@RestController
public class TestController {

    @Value("${db.type}")
    public String str;

    @RequestMapping("/test")
    public void testMethod() {
        System.out.println("apollo-db.type-value:"+str);
    }
}
