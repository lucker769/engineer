package com.lucker.test.atomic_test;

import java.util.*;

/**
 * Created by lucker on 2018/9/13.
 */
public class Test3 {
    private static List<String> result = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> list = Arrays.asList(arr);
        //print(list);
        printRun(list, 4);
        System.out.println(result);

        long end = System.currentTimeMillis();
        System.out.println("total time : " + (end - start));
    }

    private static void print(List<Integer> list){
        for (Integer i : list){
            //System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //System.out.println(i + "d");
            result.add(i + "d");
        }
    }

    private static void printRun(List<Integer> list, int threadCount){
        int size = list.size();
        int pagesize = size % threadCount == 0 ? size / threadCount : size / threadCount + 1;
        List<Thread> threadList = new ArrayList<>();
        for (int i = 0; i < threadCount; i++){
            int start = i * pagesize;
            int end = start + pagesize > size ? size : start + pagesize;
            Thread t = new Thread(new Hw(list, start, end));
            threadList.add(t);
            t.start();
        }
        for (Thread t : threadList) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    static class Hw implements Runnable {
        private List<Integer> list;
        private int start;
        private int end;

        public Hw(List<Integer> list, int start, int end) {
            this.list = list;
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            List<Integer> list1 = list.subList(start, end);
            System.out.println(list1);
            print(list1);
        }
    }



}
