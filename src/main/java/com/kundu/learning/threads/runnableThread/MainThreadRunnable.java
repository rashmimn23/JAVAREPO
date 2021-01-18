package com.kundu.learning.threads.runnableThread;

public class MainThreadRunnable {

    public static void main(String[] args) {
        Runnable r1 = new RunnableThread1();
        Runnable r2 = new RunnableThread2();
        //create separate threads
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
