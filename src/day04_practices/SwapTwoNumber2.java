package day04_practices;

public class SwapTwoNumber2 {

    public static void main(String[] args) {

        int x = 10;
        int y = 15;
        System.out.println("x = " + x + "\ny = " + y);
        x = x + y; // x = 25; y = 15;
        y = x - y; // x = 25; y = 25 - 15; ==> y = 10;
        x = x - y; // x = 25 - 10; ==> x = 15; y = 10;

        System.out.println("x = " + x + "\n" + "y = " + y);

    }
}

/**
 Create a class named SwapTwoVariable2 and declare the following variables:
     x
     y

    Write a program that swap variables x & y’ values without using any temporary variables
    Ex:
     x = 10
     y = 15

    output:
     x = 15
     y = 10
 */