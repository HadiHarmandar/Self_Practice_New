package day04_practices;

public class Circle {

    public static void main(String[] args) {

        double radius = 5,
                area = Math.PI * Math.pow(radius, 2),
                perimeter = 2 * Math.PI * radius;

        System.out.println("Area of the circle is " + area + "\n" +
                "Perimeter of the circle is " + perimeter);

    }
}

/**
 Create a class named Circle and declare the following variables:
     radius
     area
     perimeter

    Write a program that can calculate the area and perimeter of a circle with any given radius
    Ex:
        radius = 5

    output:
         Area of the circle is 78.5
         Perimeter of the circle is 31.4
 */