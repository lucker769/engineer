package com.java8.test.test1;

import java.util.function.Predicate;

/**
 * @description:
 * @author: zhiyun.yu
 * @create: 2019-06-26 14:38
 **/
public interface MyList<T> {

    T head();

    MyList<T> tail();

    MyList<T> filter(Predicate<T> p);

    default boolean isEmpty(){
        return true;
    }

}
