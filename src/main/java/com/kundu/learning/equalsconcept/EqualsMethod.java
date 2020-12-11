package com.kundu.learning.equalsconcept;

public class EqualsMethod {

    public static void main(String[] args) {

        String a1 = new String("Rashmi");
        String a2 = new String("Rashmi");

        System.out.println("Before");
        boolean output1=a1 == a2;
        System.out.println("Output of ==method " + output1);
        System.out.println("Output of  equals method " + a1.equals(a2));

        System.out.println("After");
        a1=a2;

        boolean output2=a1 == a2;

        // == will compare the address of a1 and a2
        System.out.println("Output of ==method " + output2);
        // == will compare the address of a1 and a2
        System.out.println("Output of  equals method " + a1.equals(a2));

        String b1="Ravi";
        String b2="Ravi";

        boolean output3=b1 == b2;

        // == will compare the address of a1 and a2
        System.out.println("Output of == method " + output3);
        // == will compare the address of a1 and a2
        System.out.println("Output of  equals method " + b1.equals(b2));
    }
}
