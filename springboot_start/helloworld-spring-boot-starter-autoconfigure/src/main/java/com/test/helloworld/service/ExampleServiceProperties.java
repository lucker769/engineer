package com.test.helloworld.service;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @description:
 * @author: lucker769
 * @create: 2019-01-21 17:52
 **/
@ConfigurationProperties("example.service")
public class ExampleServiceProperties {
    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

}
