package com.lucker.design;

import com.lucker.design.adaptee.Adaptee;
import com.lucker.design.adaptee.AdapteeImpl;
import com.lucker.design.adapter.AdapterComb;
import com.lucker.design.adapter.AdapterExtends;
import com.lucker.design.adapter.AdapterInterface;
import com.lucker.design.target.Target;

/**
 * 适配器模式main测试
 */
public class App {
    public static void main( String[] args ) {
        //组合方式
        Adaptee adaptee = new AdapteeImpl();
        Target targetComb = new AdapterComb(adaptee);
        targetComb.doTarget();

        //继承方式
        Target targetExtends = new AdapterExtends();
        targetExtends.doTarget();

        //实现adapter和target接口方式
        Target targetInterface = new AdapterInterface();
        targetInterface.doTarget();
    }
}
