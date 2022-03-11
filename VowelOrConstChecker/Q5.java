import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        // Write a program that prompts the user to enter a lowercase or uppercase letter. Check that the
        //input is valid and if so, check whether the letter is a vowel or consonant. If the input is invalid, display
        //a suitable message.

        System.out.println("Please enter an upper or lowercase letter: ");

        Scanner myScanner = new Scanner(System.in);
        char ch = myScanner.next().charAt(0);

        if(Character.isLetter(ch)){
            if (ch != 'a' && ch != 'A' && ch != 'e' && ch != 'E' && ch != 'I' && ch != 'i' && ch != 'o' && ch != 'O' && ch != 'u' && ch != 'U'){
                System.out.println("The letter is a consonant");
            }
            else {
                System.out.println("The letter is a vowel");
            }
        }
        else {
            System.out.println("Input isn't a letter!");
        }
        myScanner.close();
    }
}
