package com.lucker.design.adapter;

import com.lucker.design.adaptee.AdapteeImpl;
import com.lucker.design.target.Target;

/**
 * 继承方式的适配器
 *
 * Created by lucker on 2018/7/9.
 */
public class AdapterExtends extends AdapteeImpl implements Target {

    @Override
    public void doTarget() {
        this.doAdaptee();
    }

}
