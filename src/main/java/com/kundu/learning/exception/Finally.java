package com.kundu.learning.exception;

public class Finally {

    public static void main(String[] args) {
        System.out.println(Finally.testFinally());

    }

    public static String testFinally() {
        String a = null;
        try {
           // a = "Normal";
           // return a;
            throw new Exception("Exception");
        } catch (Exception e) {
           // System.out.println("Exception");
            a="Exception";
            return a;
        } finally {
            a="Finally";
            //System.out.println("Finally Block");
        }
       // return a;
    }
}
