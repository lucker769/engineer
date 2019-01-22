package com.lucker.design.adaptee;

/**
 * 被适配的类
 *
 * Created by lucker on 2018/7/9.
 */
public class AdapteeImpl implements Adaptee {
    @Override
    public void doAdaptee() {
        System.out.println("adaptee method run in adaptee");
    }
}
