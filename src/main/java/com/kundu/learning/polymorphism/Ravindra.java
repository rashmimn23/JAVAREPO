package com.kundu.learning.polymorphism;


// overloading

public class Ravindra {

    public void start() {
        System.out.println("Welcome com.kundu.learning.polymorphism Ravindra");
    }

    public void start(int i) {
        System.out.println("int method " + i);
    }

    public void start(String i) {
        System.out.println("String method " + i);
    }

//   public void start(String i, int j) {
//        System.out.println("String int " + i + ' ' + j);
//    }

    public void start(int i, String j) {
        System.out.println("int String " + i + ' ' + j);
    }

    public void start(int i, float j) {
        System.out.println("int float " + i + ' ' + j);
    }

    public void start(float i, int j) {
        System.out.println("float int " + i + ' ' + j);
    }

    public void start(float j) {
        System.out.println("float "  + j);
    }

    public void start(String i, float j) {

        System.out.println("String float " + i + ' ' + j);
    }

    public static void main(String[] args) {
        Ravindra ravindra = new Ravindra();


        // case1 --> same method name with and without arguments
        ravindra.start();
        ravindra.start(194868);

        //case2 different argument type
        ravindra.start(194868);
        ravindra.start("Rashmi");

        //case3 different sequence of arguments
        ravindra.start(194868, "Rashmi");
        ravindra.start("Rashmi", 194868);

        //case4 datatype promotion - int to float

        ravindra.start(20);


        ravindra.start("Rashmi", 20);
    }
}
