package com.test.hw;

import com.test.helloworld.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 *  方法调用型starter: https://juejin.im/entry/58d37630570c350058c2c15c
 *  注解型starter：https://fangjian0423.github.io/2016/11/16/springboot-custom-starter/
 * @author: lucker769
 * @create: 2019-01-21 18:07
 **/
@SpringBootApplication
@RestController
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    private ExampleService exampleService;

    @GetMapping("/input")
    public String input(String word) {
        return exampleService.wrap(word);
    }
}
