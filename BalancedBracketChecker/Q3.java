package test_06488587;

/*
          #####################################################
          #     Name: Tomas Murphy                            #
          #     Student Number: 06488587                      #
          #     Module Name: COMP30820 Java Programming       #
          #     Date: 01/04/19                                #
          #     Question Number: 3                            #
          #     Description: Balanced bracket check           #
          #                                                   #
          #####################################################
*/

public class Q3 {
    public static void main(String[] args) {
        // test cases...

        // the following test cases should return: true
        System.out.println(isBalanced(""));
        System.out.println(isBalanced("()"));
        System.out.println(isBalanced("()()"));
        System.out.println(isBalanced("(())"));

        // the following test cases should return: false
        System.out.println(isBalanced("("));
        System.out.println(isBalanced(")"));
        System.out.println(isBalanced("(()"));
        System.out.println(isBalanced("()(("));


    }

    // write this method
    public static boolean isBalanced(String p){
        if (p == null) {
            return true;
        } else {
            int countLeft = 0;
            int countRight = 0;

            for (int i = 0; i < p.length(); i++) {
                if (p.charAt(i) == ')') {
                    countRight++;
                    if (countRight > countLeft){
                        return false;
                    }
                } else if (p.charAt(i) == '(') {
                    countLeft++;
                }
            }
            if (countLeft == countRight) {
                return true;
            } else
                return false;
        }
    }
}
