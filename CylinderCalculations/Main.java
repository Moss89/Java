package Tomas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Write a program that reads in the radius and length of a cylinder and computes the area and
        //volume of the cylinder using the following equations: area = π ∗ (radius)2,
        // volume = area ∗ length.
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double radius = myScanner.nextDouble();
        System.out.println("Enter the length:");
        double length = myScanner.nextDouble();
        double area = Math.PI * Math.pow(radius,2);
        System.out.println("The area is : " + area);
        System.out.println("The volume is: " + area * length);
        myScanner.close();
    }
}
