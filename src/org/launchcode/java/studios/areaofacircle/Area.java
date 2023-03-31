package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = -1;
        while (radius < 0)
            if (scanner.hasNextDouble()) {
                radius = scanner.nextDouble();
                double area = Circle.getArea(radius);
                System.out.println("The area of a circle of radius " + radius + " is: " + area);
            } else{
                System.out.println("Please enter a number");
                scanner.next();
            }
        }

    }



