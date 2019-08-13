package com.java8.test;

/**
 * @description:
 * @author: zhiyun.yu
 * @create: 2019-02-28 16:46
 **/
public class Trader {
    private final String name;
    private final String city;

    public Long getAge() {
        return age;
    }

    private final Long age;

    public Trader(String n, String c, Long age) {
        this.name = n;
        this.city = c;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getCity() {
        return this.city;
    }

    @Override
    public String toString() {
        return "Trader:" + this.name + " in " + this.city;
    }

}
