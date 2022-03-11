package test_06488587;

/*
          #####################################################
          #     Module Name: COMP30820 Java Programming       #
          #     Date: 01/04/19                                #
          #     Question Number: 1                            #
          #     Description: Sum of digits in string          #
          #                                                   #
          #####################################################
*/


public class Q1 {
    public static void main(String[] args) {
        // test cases

        // should return: 0
        System.out.println("test case 1: " + getSumDigits(""));

        // should return: 0
        System.out.println("test case 2: " + getSumDigits("hello"));

        // should return: 5
        System.out.println("test case 3: " + getSumDigits("a2b3"));

    }

    // write this method
    public static int getSumDigits(String str) {
        if (str == null){
            return 0;
        }
        else{
            int count = 0;
            for (int i = 0; i < str.length(); i++){
                String tempChar = "";
                if(Character.isDigit(str.charAt(i))){
                    tempChar += str.charAt(i);
                    count += Integer.parseInt(tempChar);
                }
            }
            return count;
        }
    }
}

