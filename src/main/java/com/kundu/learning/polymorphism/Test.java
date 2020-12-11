package com.kundu.learning.polymorphism;

public class Test {

    // Main method overloading

    public static void main(String[] args) {
        System.out.println("Main method overlaoding string");
        Test test = new Test();
        test.main(10);
    }

    public static void main(int a) {
        System.out.println("Main method overlaoding integer");
    }


    protected void access(){
        System.out.println("protected different pacakge");
    }
}
