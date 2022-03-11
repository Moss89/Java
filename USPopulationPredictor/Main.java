package Tomas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//  The U.S. Census Bureau projects population based on the following assumptions:
        //- One birth every 7 seconds,
        //- One death every 13 seconds, and
        //- One new immigrant every 45 seconds.
        //Write a program to prompt the user to enter a number of years and displays the population after this
        //number of years. Assume the current population is 312,032,486 and one year has 365 days.

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a number of years: ");
        int numYears = myScanner.nextInt();
        int seconds = numYears * 365 * 24 * 60 * 60;
        int numBirths = seconds/7;
        int numDeaths = seconds/13;
        int numImmigrants = seconds/45;
        System.out.println("The population after " + numYears + " year(s) will be approx. " + (312032486 + numBirths + numImmigrants - numDeaths));
        myScanner.close();

    }
}
