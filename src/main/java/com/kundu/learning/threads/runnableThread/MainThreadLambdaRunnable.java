package com.kundu.learning.threads.runnableThread;

/*
Using lambda expression for Runnable object
 */
public class MainThreadLambdaRunnable {

    public static void main(String[] args) {

        Runnable r1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("implementation1");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        };
        Runnable r2 = ()-> {
            for (int i = 0; i < 5; i++) {
                System.out.println("implementation2");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();

    }
}
