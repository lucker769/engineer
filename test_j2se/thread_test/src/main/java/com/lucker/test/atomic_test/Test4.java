package com.lucker.test.atomic_test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by lucker on 2018/9/19.
 */
public class Test4 {


    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 0, 6, 7, 8, 9, 10};
        List<Integer> list = Arrays.asList(arr);

        for (Integer i : list){
            try {
                System.out.println(10 / i);
            } catch (Exception e) {
                System.out.println("error num ：" + i);
                e.printStackTrace();
            }
        }

    }
}
