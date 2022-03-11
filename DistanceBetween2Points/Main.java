package Tomas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Write a program that prompts the user to enter two points (x1, y1) and (x2, y2) and displays the
        //distance between them. The formula for computing the distance is √(x2 − x1)2 + (y2 − y1)2. Note
        //that you can use Math.pow(a, 0.5) or Math.sqrt(a) to compute √a.
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter x1");
        double x1 = myScanner.nextDouble();
        System.out.println("Enter x2");
        double x2 = myScanner.nextDouble();
        System.out.println("Enter y1");
        double y1 = myScanner.nextDouble();
        System.out.println("Enter y2");
        double y2 = myScanner.nextDouble();
        System.out.println("The distance between the points is: " + Math.pow(Math.pow((x2-x1),2)+Math.pow((y2-y1),2),0.5));
        myScanner.close();
    }
}
