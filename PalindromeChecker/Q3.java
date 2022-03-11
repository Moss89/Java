import java.net.SecureCacheResponse;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a string to check if" +
                " it's a palindrome: ");
        String myString = myScanner.nextLine();
        if (isPalindrome(myString)){
            System.out.println(myString + " is a palindrome.");
        }
        else {
            System.out.println(myString + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str){
        String reverse = "";
        str = str.toLowerCase();
        for (int i = str.length(); i > 0; i--){
            reverse += str.charAt(i-1);
        }
        if (reverse.equals(str)){
            return true;
        }
        return false;
    }
}
