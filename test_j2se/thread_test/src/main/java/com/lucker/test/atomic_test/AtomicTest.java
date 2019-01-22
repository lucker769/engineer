package com.lucker.test.atomic_test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by lucker on 2018/5/10.
 */
public class AtomicTest {
    public static AtomicInteger value = new AtomicInteger();

    class MyThread extends Thread {

        @Override
        public void run() {
            try {
                Thread.sleep((long) ((Math.random()) * 100));
                //原子自增
                value.incrementAndGet();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[100];
        for (int i=0;i<100;i++){
            threads[i] = new AtomicTest().new MyThread();
            threads[i].start();
        }

        for (int j=0;j<100;j++){
            threads[j].join();
        }

        System.out.println("value:"+AtomicTest.value);
    }

}
