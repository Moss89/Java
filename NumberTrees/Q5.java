import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        System.out.println("Please enter a number: ");

        Scanner myScanner = new Scanner(System.in);

        int range = myScanner.nextInt();

        char space = ' ';

        for (int i = 1; i <= range; i++){
            for (int k = 1; k <= i; k++){
            System.out.print(k);
            }
            for (int j = 1; j <= (range - i); j++) {
                System.out.print("*");
            }
            System.out.println("");

        }

    }
}
