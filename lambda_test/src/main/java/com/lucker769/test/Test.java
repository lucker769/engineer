package com.lucker769.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * @Author: yuzhiyun_cd
 * @Description: http://www.cnblogs.com/franson-2016/p/5593080.html
 * @Date: Created on 2017/9/6.
 */
public class Test {

    public static void main(String[] args) {
        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer", "Roger Federer",
                "Andy Murray", "Tomas Berdych",
                "Juan Martin Del Potro"};

        // 1.1 使用匿名内部类根据 name 排序 players
        //Arrays.sort(atp, new Comparator<String>() {
        //    @Override
        //    public int compare(String s1, String s2) {
        //        return (s1.compareTo(s2));
        //    }
        //});

        // 1.2 使用 lambda expression 排序 players
        //Comparator<String> sortByName = (String s1, String s2) -> (s1.compareTo(s2));
        //Arrays.sort(atp, sortByName);

        // 1.3 也可以采用如下形式:
        //Arrays.sort(atp, (String s1, String s2) -> (s1.compareTo(s2)));
        //
        //List<String> players = Arrays.asList(atp);

        // 1.以前的循环方式
        //for (String player : players) {
        //    System.out.print(player + "; ");
        //}

        // 2.使用 lambda 表达式以及函数操作(functional operation)
        //players.forEach((player) -> System.out.print(player + "; "));

        // 3.在 Java 8 中使用双冒号操作符(double colon operator)
        //players.forEach(System.out::println);

        /**
         * 使用summaryStatistics方法获得stream 中元素的各种汇总数据。 接下来,我们可以访问这些方法,比如getMax, getMin, getSum或getAverage
         */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        IntSummaryStatistics stats = numbers
                .stream()
                .mapToInt((x) -> x)
                .summaryStatistics();

        System.out.println("List中最大的数字 : " + stats.getMax());
        System.out.println("List中最小的数字 : " + stats.getMin());
        System.out.println("所有数字的总和   : " + stats.getSum());
        System.out.println("所有数字的平均值 : " + stats.getAverage());
    }

}
