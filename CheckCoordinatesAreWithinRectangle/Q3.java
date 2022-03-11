import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // 3 Write a program that prompts the user to enter the x and y coordinates of a point and checks
        //whether the point is inside or on the edge of the rectangle centered at (0, 0) with width 10 and height
        //5. For example, point (2, 2) is inside the rectangle and point (6, 4) is outside the rectangle.

        System.out.println("Please enter an X coordinate: ");

        Scanner myScanner = new Scanner(System.in);
        int X = myScanner.nextInt();

        System.out.println("Please enter an Y coordinate: ");
        int Y = myScanner.nextInt();

        if (X > 2.5 || X < -2.5 || Y > 5 || Y < -5){
            System.out.println("The coordinates are outside the rectangle!");
        }
        else {
            System.out.println("The coordinates are inside the rectangle!");
        }
        myScanner.close();
    }
}
