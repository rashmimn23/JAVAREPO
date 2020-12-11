package com.kundu.learning.programsstring;

public class Compare {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "java";
        String str3 = "Java";
        String str4 = new String("Java");

        //Compare using .equals true=same, false=no
        System.out.println("Compare Java and java using .equals " + str1.equals(str2));
        System.out.println("Compare Java and Java using .equals " + str1.equals(str3));
        System.out.println("Compare Java and Java with new keyword using .equals " + str1.equals(str4));

        //Compare using .equalsIgnoreCase true=same, false=no
        System.out.println("Compare Java and java using .equalsIgnoreCase " + str1.equalsIgnoreCase(str2));
        System.out.println("Compare Java and Java using .equalsIgnoreCase " + str1.equalsIgnoreCase(str3));
        System.out.println("Compare Java and Java with new keyword using .equalsIgnoreCase " + str1.equalsIgnoreCase(str4));

        //Compare using compareTo() if same o/p is zero
        System.out.println("Compare Java and java using compareTo() " + str1.compareTo(str2));
        System.out.println("Compare Java and Java using compareTo() " + str1.compareTo(str3));
        System.out.println("Compare Java and Java with new keyword using compareTo() " + str1.compareTo(str4));

        //Compare using == operator
        // if new keyword is used == compare will give false
        System.out.println("Compare Java and java using == operator() " + str1==str2);
        System.out.println("Compare Java and Java using == operator() " + str1==str3);
        System.out.println("Compare Java and Java with new keyword using == operator() " + str1==str4);
    }
}
