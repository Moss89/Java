import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        // Write a program that prompts the user to enter an integer between 0 and 15, inclusive. Check
        // that the input is valid and if so, display its corresponding hex number. If the input is invalid, display
        // a suitable message.
        System.out.println("Please enter an integer between 0 and 15 inclusive: ");

        Scanner myScanner = new Scanner(System.in);
        int number = myScanner.nextInt();

        if (number < 0 || number > 15){
            System.out.println("Invalid number!");
        }
        else {
            System.out.println("Hex number: ");
            if (number < 10){
                System.out.println(number);
            }
            else if (number == 10){
                System.out.println("A");
            }
            else if (number == 11){
                System.out.println("B");
            }
            else if (number == 12){
                System.out.println("C");
            }
            else if (number == 13){
                System.out.println("D");
            }
            else if (number == 14){
                System.out.println("E");
            }
            else{
                System.out.println("F");
            }
        }
        myScanner.close();
    }
}
