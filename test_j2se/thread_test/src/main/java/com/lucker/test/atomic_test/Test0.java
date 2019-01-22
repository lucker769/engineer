package com.lucker.test.atomic_test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.jws.HandlerChain;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lucker on 2018/7/10.
 */
public class Test0 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String[] atps = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka", "David Ferrer",
                "Roger Federer", "Andy Murray",
                "Tomas Berdych", "Juan Martin Del Potro",
                "Richard Gasquet", "John Isner"};

// 1.1 使用匿名内部类根据 name 排序 players
//        Arrays.sort(atps, new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return (s1.compareTo(s2));
//            }
//        });
//        Arrays.sort(atps, (String s1, String s2) -> (s1.compareTo(s2)));
//
//        List<String> players =  Arrays.asList(atps);
//        players.forEach(System.out::println);

        String test = "abc";
        String test1 = test.replace("a", "A");
        System.out.println(test);
        System.out.println(test1);

    }

    @Data
    @AllArgsConstructor
    static class User{
        private int id;
        private String name;
    }

    @Data
    static class Person{
        private int id;
        private String name;
    }
}