package com.lucker769.arrayBlockingQueue;

import java.util.concurrent.BlockingQueue;

/**
 * Created by admin on 2017/9/5.
 */
public class Producer implements Runnable {

    protected BlockingQueue queue = null;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            queue.put("1");
            Thread.sleep(3000);
            queue.put("2");
            Thread.sleep(5000);
            queue.put("3");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
