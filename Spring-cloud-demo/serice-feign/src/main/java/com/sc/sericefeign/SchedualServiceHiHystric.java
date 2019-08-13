package com.sc.sericefeign;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: zhiyun.yu
 * @create: 2019-08-13 17:44
 **/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }

}
