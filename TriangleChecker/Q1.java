import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
    // Write a program that prompts the user to enter the lengths of the three sides of a triangle and
        //computes the perimeter of the triangle if the input is valid. The input is valid if the sum of every pair
        //of the lengths of two sides is greater than the length of the remaining side. If the input is invalid,
        //display a suitable message.

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the length of side 1: ");
        double side1 = myScanner.nextDouble();

        System.out.println("Enter the length of side 2: ");
        double side2 = myScanner.nextDouble();

        System.out.println("Enter the length of side 3: ");
        double side3 = myScanner.nextDouble();

        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1){
            System.out.println("The input is invalid!");
        }
        else{
            System.out.println("The perimeter of the triangle is: " + (side1+side2+side3));
        }
        myScanner.close();
    }
}
