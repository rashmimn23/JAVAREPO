package com.kundu.learning.programsnumber;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int no;
        Boolean flag=true;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=s.nextInt();
        s.close();
        for(int i=2;i<=num/2;i++){
            no=num%i;
            if(no==0){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println(num +" is a Prime number");
        }
        else {
            System.out.println(num +" is not a Prime number");
        }
    }
}
