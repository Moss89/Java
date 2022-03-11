import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        System.out.println("Please enter a string to reverse!");
        Scanner myScanner = new Scanner(System.in);
        String inputStr = myScanner.nextLine();

        String reversed = "";

        for (int i = inputStr.length()-1; i >= 0; i--){
            reversed += inputStr.charAt(i);
        }
        System.out.println("The reversed string is: " + reversed);
    }
}
