package com.lucker.design.adapter;

import com.lucker.design.adaptee.Adaptee;
import com.lucker.design.target.Target;

/**
 * 实现adapter和target接口方式的适配器
 *
 * Created by lucker on 2018/7/9.
 */
public class AdapterInterface implements Adaptee, Target {
    @Override
    public void doAdaptee() {
        System.out.println("adaptee method run in adapter");
    }

    @Override
    public void doTarget() {
        this.doAdaptee();
    }
}
