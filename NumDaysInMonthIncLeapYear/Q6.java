import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        //  Using a switch statement, write a program that prompts the user to enter a year and the first
        //three letters of a month name, with the first letter in uppercase (e.g. Jan, Feb, etc. – if this format is
        //not followed, the program should display a suitable error message). The program should display the
        //number of days in the month for the specified year. If the month entered is Feb, the program should
        //check if the year entered is a leap year and output 28 or 29 days as appropriate.

        System.out.println("Please enter a year: ");

        Scanner myScanner = new Scanner(System.in);
        int year = myScanner.nextInt();
        System.out.println("Enter the first 3 letters of a month, with the first letter in uppercase: ");
        String month = myScanner.next();

        char firstChar = month.charAt(0);
        if(!Character.isUpperCase(firstChar)){
            System.out.println("Invalid month!");
        }
        else{
            switch(month){
                case "Jan":
                case "Mar":
                case "May":
                case "Jul":
                case "Aug":
                case "Oct":
                case "Dec":
                    System.out.println("There are 31 days.");
                    break;
                case "Feb":
                    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                        System.out.println("There are 29 days");
                    } else {
                        System.out.println("There are 28 days");
                    }
                    break;
                case "Apr":
                case "Jun":
                case "Sep":
                case "Nov":
                    System.out.println("There are 30 days.");
                    break;
                default:
                    System.out.println("Not a recognised month");
            }
        }
        myScanner.close();

    }
}
