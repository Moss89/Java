package Tomas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Write a program that prompts the user to enter the distance to drive, the fuel efficiency of the
        //car in miles per gallon, and the price per gallon, and displays the cost of the trip.

        Scanner myScan = new Scanner(System.in);
        System.out.println("Distance: ");
        double distance = myScan.nextDouble();
        System.out.println("Fuel Efficiency in Miles per Gallon: ");
        double efficiency = myScan.nextDouble();
        System.out.println("Price per Gallon: ");
        double price = myScan.nextDouble();
        System.out.println("The cost of the trip is : " + (distance / efficiency * price));
        myScan.close();

    }
}
