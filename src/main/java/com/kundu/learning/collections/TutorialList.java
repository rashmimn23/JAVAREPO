package com.kundu.learning.collections;

import java.util.*;

public class TutorialList {

    public static void main(String args[]) {

        List<Integer> numbers = new ArrayList();

        numbers.add(78);
        numbers.add(56);
        numbers.add(23);
// adding duplicate value in list is allowed
        numbers.add(23);
        System.out.println("Display before inserting 35");
// Display method 1
        Iterator i = numbers.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        numbers.add(1, 35);
        System.out.println("Display after inserting 35");
// Display method 2
        for (int j : numbers) {
            System.out.println(j);
        }

        Collections.sort(numbers);
        System.out.println("Display after sorting");
// Display method 3
     //  numbers.forEach(System.out::println);

        numbers.remove(2);
        System.out.println("Display after removing index 2 number");
       // numbers.forEach(System.out::println);
    }
}
