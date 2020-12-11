package com.kundu.learning.polymorphism;

public class TutorialInheritence {

    public static void main(String[] args) {

        Ravi ravi = new Ravi();
        Rashmi rashmi = new Rashmi();

        ravi.start();
        rashmi.start();

        Ravi ravi1 = new Rashmi();
        ravi1.start();
    }
}
