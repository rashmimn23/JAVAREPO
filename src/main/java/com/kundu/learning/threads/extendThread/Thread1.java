package com.kundu.learning.threads.extendThread;

public class Thread1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("implementation1");
            try {
                Thread1.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
