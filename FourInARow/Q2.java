import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Please enter how many values are to be inputted: ");
        Scanner myScanner = new Scanner(System.in);
        int numInput = myScanner.nextInt();
        myScanner.nextLine();
        System.out.println("Please input the integers, with a space separating the values: ");
        String inputInts = myScanner.nextLine();

        int isFour = 0;
        int myNum = 0;
        String[] split = inputInts.split((" "));
        for (int i = 0; i < numInput; i++) {
            if(isFour == 4){
                System.out.println("Four numbers found in a row: " + inputInts);
                System.exit(0);
            }

            if (Integer.parseInt(split[i]) == myNum){
                isFour += 1;
            }
            else{
                isFour = 1;
                myNum = Integer.parseInt(split[i]);
            }
        }
        if(isFour == 4){
            System.out.println("Four of the same number found in a row: " + inputInts);
        }
        else{
            System.out.println("No four in a row.");
        }
    }
}
