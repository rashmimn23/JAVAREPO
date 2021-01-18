package com.kundu.learning.threads.extendThread;

public class MainThreadClass {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        try {
            Thread1.sleep(500);
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
    }
}

