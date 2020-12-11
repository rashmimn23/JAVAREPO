package com.kundu.learning.programsstring;

public class OtherFunctions {

    public static void main(String[] args) {

        String str1= "Java Programming";

        System.out.println(str1.length());
        //charAt
        System.out.println("Output of charAt() index 5 is " + str1.charAt(5));

        //toLowerCase
        System.out.println("Output of toLowerCase() is " + str1.toLowerCase());

        //toUpperCase
        System.out.println("Output of toUpperCase() is " + str1.toUpperCase());

        //replace
        System.out.println("Output of replace() is " + str1.replace("a", "o"));

        //escape character
        System.out.println("Using escape character " + str1+" is \"fun\" ?");
    }
}
