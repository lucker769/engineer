package com.lucker.design.adapter;

import com.lucker.design.adaptee.Adaptee;
import com.lucker.design.target.Target;

/**
 * 组合方式的适配器
 *
 * Created by lucker on 2018/7/9.
 */
public class AdapterComb implements Target {
    private Adaptee adaptee;

    public AdapterComb(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void doTarget() {
        adaptee.doAdaptee();
    }
}
