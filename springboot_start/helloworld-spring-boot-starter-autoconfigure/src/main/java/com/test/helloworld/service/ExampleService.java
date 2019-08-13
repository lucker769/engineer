package com.test.helloworld.service;

/**
 * @description:
 * @author: lucker769
 * @create: 2019-01-21 17:52
 **/
public class ExampleService {
    private String prefix;
    private String suffix;

    public ExampleService(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }
    public String wrap(String word) {
        return prefix + word + suffix;
    }
}
