package day04_practices;

public class SwapTwoVariable1 {

    public static void main(String[] args) {

        int x = 10;
        int y = 15;
        System.out.println("x = " + x + "\ny = " + y);
        int z = x; // temporary variable ==> z = 10;
        x = y; // x = 15; y = 15;
        y = z; // y = 10;
        // x = 15; y = 10;

        System.out.println("x = " + x + "\n" + "y = " + y);

    }
}

/**
 Create a class named SwapTwoVariables1 and declare the following variables:
     x
     y
     z

    Write a program that swap variables x & y’ values by using a temporary variable z
    Ex:
     x = 10
     y = 15

    output:
     x = 15
     y = 10
 */