import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter how many values are to be inputted: ");
        Scanner myScanner = new Scanner(System.in);
        int numInput = myScanner.nextInt();
        myScanner.nextLine();
        System.out.println("Please input the doubles, with a space separating the values: ");
        String inputDoubs = myScanner.nextLine();


            String[] split = inputDoubs.split((" "));

            double sum = 0.0;
            for (int i = 0; i < numInput; i++) {
                double number = Double.parseDouble(split[i]);
                sum += number;
            }
            double mean = sum / numInput;
            System.out.println("The mean of the numbers" +
                    " is: " + mean);

            double stdSum = 0.0;
            for (int j = 0; j < numInput; j++){
                double number = Double.parseDouble(split[j]);
                double stdI = Math.pow(number - mean,2);
                stdSum += stdI;
            }

            double stdDevTop = stdSum;
            double stdDevBottom = numInput - 1;
            double stdDiv = stdDevTop/stdDevBottom;
            double stdDev = Math.sqrt(stdDiv);

        System.out.println("The standard deviation of the numbers" +
                " is: " + stdDev);
        }
    }


