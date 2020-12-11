package com.kundu.learning.exception;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        //Arithmetic exception
        try {
/*            int[] a = new int[5];
            //a[5]= 10/0;
            a[6]=6;*/

            String a = null;
            a.length();

        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
       //If the exception is other than above declared then below catch will be executed
        catch (Exception e) {
            System.out.println("Generic Exception");
        }
        System.out.println("End of code");
    }
}
