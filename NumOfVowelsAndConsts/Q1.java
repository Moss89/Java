import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {

        System.out.println("Please enter a string: ");
        Scanner myScanner = new Scanner(System.in);
        String inputStr = myScanner.nextLine();

        inputStr = inputStr.toLowerCase();
        inputStr = inputStr.trim();
        int letters = inputStr.length();
        int vowels = 0;

        for (int i = 0; i < inputStr.length(); i++) {
            if (isVowel(inputStr.charAt(i))){
                vowels++;
            }
            else if (inputStr.charAt(i) == ' '){
                letters --;
            }
        }
        System.out.println("The number of consonants is: " + (letters - vowels));
        System.out.println("The number of vowels is: " + vowels);

    }

    public static boolean isVowel(char c)
    {
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

