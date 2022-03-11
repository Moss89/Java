import java.util.Scanner;

public class Q4 {

        // main method
        public static void main(String[] args) {
            // Prompt the user to enter a credit card number
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a credit card number: ");
            String number = input.nextLine().trim();

            // Display result
            System.out.println(number + (isValidNumber(number) ? " is valid" : " is invalid"));

            // Close the Scanner
            input.close();
        }

        // Return true if the card number is valid
        public static boolean isValidNumber(String number) {
            int summy = getSumDigits(sumOfDoubleEvenPlace(number), sumOfOddPlace(number));
            if (hasValidLength(number) && hasValidPrefix(number) && satisfiesMod10Check(summy)) {
                return true;
            }
            return false;
        }

        // Return true if the card number has between 13 and 16 digits
        public static boolean hasValidLength(String number) {
            if (number.length() >= 13 && number.length() <= 16){
                return true;
            }
            return false;
        }

        // Return true if the card number has a valid prefix
        public static boolean hasValidPrefix(String number)
        {
            if((number.charAt(0) == '4') || (number.charAt(0)=='5') || (number.charAt(0)=='6') || (number.charAt(0)== '3' && number.charAt(1)=='7')){
                return true;
            }
            return false;
        }

        // Return true if the Mod 10 check is satisfied
        public static boolean satisfiesMod10Check(int number) {
            if (number % 10 == 0){

                System.out.println("Mod passed.");
                return true;
            }
            return false;
        }

        // Double every second digit from right to left and return sum
        public static int sumOfDoubleEvenPlace(String number) {

            int sum = 0;
            for (int i = number.length()-2; i >=0; i-=2){
                int nummy = Character.getNumericValue(number.charAt(i));
                nummy = nummy * 2;
                if (nummy > 9){
                    int first = nummy /10;
                    int second = nummy%10;
                    nummy = first + second;
                }
                sum += nummy;
            }
            System.out.println("Even: " + sum);
            return sum;
        }

        // Return sum of digits in odd places from right to left
        public static int sumOfOddPlace(String number) {
            int sumodd = 0;
            for (int i = number.length()-1; i >=0; i-=2){
               int nummy = Character.getNumericValue(number.charAt(i));
            sumodd += nummy;
            }
            System.out.println("Odd sum:" + sumodd);
            return sumodd;
        }

        // Return this number if it is a single digit;
        // otherwise return the sum of the two digits
        public static int getSumDigits(int number1, int number2) {
            System.out.println(number1);
            System.out.println(number2);
            System.out.println(number1 + number2);

            return number1 + number2;
        }
    }

