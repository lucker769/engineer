package com.lucker.test.atomic_test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * Created by lucker on 2018/5/26.
 */
public class Test1 {

    public static void main(String[] args) throws Exception {
        Callable<Integer> callable1 = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(1000L);
                return 1;
            }
        };
        FutureTask<Integer> f1 = new FutureTask<Integer>(callable1);
        Thread t1 = new Thread(f1);

        Callable<Integer> callable2 = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(2000L);
                return 2;
            }
        };
        FutureTask<Integer> f2 = new FutureTask<Integer>(callable2);
        Thread t2 = new Thread(f2);

        Callable<Integer> callable3 = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(3000L);
                return 5;
            }
        };
        FutureTask<Integer> f3 = new FutureTask<Integer>(callable3);
        Thread t3 = new Thread(f3);

        t1.start();
        t2.start();
        t3.start();

        int a = f1.get(800L, TimeUnit.MICROSECONDS);
        int b = f2.get();
        int c = f3.get();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("a+b+c = " + (a+b+c));
        System.out.println("end");
    }

}
