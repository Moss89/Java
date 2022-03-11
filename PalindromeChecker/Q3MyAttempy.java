import java.util.Scanner;

public class Q3MyAttempy {
    public static void main(String[] args) {
        System.out.println("Input: ");
        Scanner input = new Scanner(System.in);
        String userText = input.nextLine();
        System.out.println("Is " + userText + " a palindrome?: " + isPalindrome(userText));
        input.close();
    }

    public static boolean isPalindrome(String str) {
	str = str.toLowerCase();
        for(int i = 0; i<str.length()/2; i++)
            if (str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        return true;

    }
}
