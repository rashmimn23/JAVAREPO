package com.kundu.learning.threads.runnableThread;

public class RunnableThread2 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("implementation2");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
