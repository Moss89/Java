import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("Please enter a string!");
        Scanner myScanner = new Scanner(System.in);
        String inputStr = myScanner.nextLine();
        System.out.println("Please enter another string!");
        String inputStr2 = myScanner.nextLine();

        String matchPrefix = "";

        for (int i = 0; i < inputStr.length(); i++) {
            char myChar = inputStr.charAt(i);
                if (i < inputStr2.length()) {
                    if (inputStr2.charAt(i) == myChar) {
                        matchPrefix += myChar;
                    } else {
                        break;
                }
            }
        }
        if (matchPrefix.equals("")){
            System.out.println("No common prefix!");
        }
        else {
            System.out.println("Common prefix: " + matchPrefix);
        }
    }
}
