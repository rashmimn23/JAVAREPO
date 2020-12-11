package com.kundu.learning.programsnumber;

public class FibonacciSeries {
    public static void main(String[] args) {

        int no1=0;
        int no2=1;
        int no3;
        for(int i=0; i<15;i++) {
            System.out.println(no1 + " ");
            no3 = no1 + no2;
            no1 = no2;
            no2=no3;
        }
    }
}
