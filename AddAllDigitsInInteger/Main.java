package Tomas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Write a program that reads an integer between 0 and 999 (inclusive) and adds all the digits in
        //the integer. For example, the sum of all digits in the integer 932 is 14. Hint: Use the % operator to
        //extract digits and the / operator to remove extracted digits (e.g. 932 % 10 = 2 and 932 / 10 = 93).

        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 999 inclusive: ");
        int num = myScan.nextInt();
        if (num >= 0 && num <= 999) {
            int firstNum = num % 10;
            num = num /10;
            int secNum = num % 10;
            num = num/10;
            int thirdNum = num %10;
            System.out.println("The sum = " + (firstNum + secNum + thirdNum));
        }
        else
            System.out.println("Must be between 0 and 999 inclusive!");
        myScan.close();
    }
}
