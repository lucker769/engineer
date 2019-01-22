package com.lucker.test.atomic_test;

import java.io.UnsupportedEncodingException;

/**
 * Created by lucker on 2018/6/22.
 */
public class MyTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /*String s = "慕课ABC";
        byte[] sbyte = s.getBytes("gbk");
        for (byte b:sbyte) {
            //System.out.print(b + "   ");
            //System.out.print(Integer.toString(b) + "   ");
            System.out.print(Integer.toHexString(b & 0xff) + "   ");
        }*/

        String str = "hello world";
        change(str);
        System.out.println(str);

        String[] strs = {"hello", "world"};
        change(strs);
        System.out.println(strs[0]);
    }

    public static void change(String str){
        str.replace("e", "s");
    }

    public static void change(String[] strs){
        strs[0] = "hsllo";
    }
}
