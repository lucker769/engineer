package com.java8.test;

/**
 * @description:
 * @author: zhiyun.yu
 * @create: 2019-06-24 09:38
 **/
public class Outer {

    Nested nested;

    Nested getNested () {
        return nested ;
    }
}

// 第二层对象
class Nested {
    Inner inner;

    Inner getInner () {
        return inner ;
    }
}

// 最底层对象
class Inner {
    String  foo;

    String getFoo () {
        return foo ;
    }

}
