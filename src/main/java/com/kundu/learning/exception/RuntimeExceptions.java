package com.kundu.learning.exception;

import java.lang.reflect.Array;

public class RuntimeExceptions {

    public static void main(String[] args) {
        //Arithmetic exception
        try {
            int a = 100;
            int b = 0;
            int c = a / b;
            System.out.println("Output is " + c);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Cannot divide by zero");
        }
// Arithmetic exception cannot be handled by another type of exception
/*        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }*/

// ArrayIndexOutOfBoundsException
/*        try{
            int[] a = new int[4];
            a[5]=5;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException -  index is either negative or greater than or equal to the size of the array.");
        }
    */

//NullPointerException
/*
        try {
            String a = null;
            a.length();

        } catch (NullPointerException e) {
            System.out.println("NullPointerException" );
        }
*/

        //NumberFormatException
 /*       try {
            int a=Integer.parseInt("Rashmi");

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }*/
    }
}
