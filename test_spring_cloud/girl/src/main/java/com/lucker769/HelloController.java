package com.lucker769;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lucker on 2017/10/24.
 */
@RestController
public class HelloController {

    @Value("${girl.cupSize}")
    private String cupSize;
    @Value("${girl.age}")
    private Integer age;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say(){
        return "cupSize:" + cupSize + ", age:" + age;
    }
}
