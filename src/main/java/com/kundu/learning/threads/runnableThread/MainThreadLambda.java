package com.kundu.learning.threads.runnableThread;

public class MainThreadLambda {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("implementation1");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        }, "Thread1"); // Set name in the constructor
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("implementation2");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        });

        t2.setName("Thread2");
        System.out.println("Thread1 Name " + t1.getName());
        System.out.println("Thread27 Name " + t2.getName());
        System.out.println("Thread1 normal priority " + t1.getPriority());
        t1.setPriority(6); // set priority
        System.out.println("Thread1 set priority " + t1.getPriority());
        t2.setPriority(Thread.MAX_PRIORITY); // set priority using MAX_PRIORITY
        System.out.println("Thread2 MAX priority " + t2.getPriority());

        t1.start();
        t2.start();

        System.out.println("Before " + t1.isAlive()); // Should return true

        t1.join(); // wait till t1 thread completes
        t2.join(); // wait till t2 thread completes

        System.out.println("After " + t1.isAlive()); // Should return false as join() waits for the t1 execution completion
        System.out.println("Main implementation");
    }
}
