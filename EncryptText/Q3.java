import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        System.out.println("Please enter a string to encrypt!");
        Scanner myScanner = new Scanner(System.in);
        String inputStr = myScanner.nextLine();
        String encrypt = "";

        for (int i = 0; i < inputStr.length(); i++){
            char myChar = inputStr.charAt(i);
            if(Character.isLowerCase(myChar)){
                myChar++;
            }
            encrypt += myChar;
        }
        System.out.println("New Message: " + encrypt);
    }
}
