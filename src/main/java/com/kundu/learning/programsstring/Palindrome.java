package com.kundu.learning.programsstring;

public class Palindrome {

    public static void main(String[] args) {

        //A palindrome string is one whose reverse is also same string.

        String str = "abcdcba";
        int length = str.length();
        Boolean output=true;
        for(int i=0;i<length/2;i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                output=false;
                break;
            }
        }
            System.out.println("output is " + output);
    }
}
