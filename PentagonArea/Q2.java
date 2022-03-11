import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        //  Write a program that prompts the user to enter the length from the center of a pentagon to a
        //vertex and computes the area of the pentagon.
        System.out.println("Please enter a length greater than zero: ");

        Scanner myScanner = new Scanner(System.in);

        double pentLength = myScanner.nextDouble();

        if (pentLength <= 0){
            System.out.println("Invalid input!");
        }
        else{
           double lengthOfSide = (2*pentLength)* Math.sin(Math.PI/5);

           double area = (5*(Math.pow(lengthOfSide,2)))/(4*Math.tan(Math.PI/5));
            System.out.println("The area of the pentagon is: "+ area);
        }
        myScanner.close();
    }
}
