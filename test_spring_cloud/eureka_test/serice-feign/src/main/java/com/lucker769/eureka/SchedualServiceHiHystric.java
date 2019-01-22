package com.lucker769.eureka;

import org.springframework.stereotype.Component;

/**
 * Created by lucker on 2018/3/2.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
