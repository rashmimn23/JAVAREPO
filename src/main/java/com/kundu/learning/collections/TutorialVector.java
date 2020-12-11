package com.kundu.learning.collections;

import java.util.Vector;

public class TutorialVector {
    public static void main(String[] args) {

        Vector v = new Vector();

        System.out.println("Initial " + v.capacity());
        v.add(1);
        v.add(4);
        v.add(6);
        v.add(1);
        v.add(4);
        v.add(6);
        v.add(1);
        v.add(4);
        v.add(6);
        v.add(1);
        System.out.println("Before " + v.capacity());
        System.out.println(v);
        System.out.println(v.remove(5));
        System.out.println(v);
        v.add(1);
        v.add(4);
        v.add(6);
        System.out.println("After " + v.capacity());
    }
}
