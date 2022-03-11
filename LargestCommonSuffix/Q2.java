package test_06488587;

/*
          #####################################################
          #     Module Name: COMP30820 Java Programming       #
          #     Date: 01/04/19                                #
          #     Question Number: 2                            #
          #     Description: Largest common suffix            #
          #                                                   #
          #####################################################
*/

public class Q2 {
    public static void main(String[] args) {
        // test cases

        // should return: "" (i.e. a string with no characters)
        System.out.println("test case 1: " + getLCS("hello", "HELLO"));

        // should return: "ing"
        System.out.println("test case 2: " + getLCS("computing", "working"));
    }

    // write this method
    public static String getLCS(String s1, String s2) {

        int str1Len = s1.length();
        int str2Len = s2.length();

        String smallestStr = "";
        if(str1Len<str2Len){
            smallestStr = s1;
        }
        else{
            smallestStr = s2;
        }

        String output = "";
        int index = -1;


        for (int i = 0; i < smallestStr.length(); i++){

            if (s1.charAt(s1.length()-1-i) == s2.charAt(s2.length()-1-i)){
                index = s1.length()-1-i;
            }
            else
            {
                break;
            }
        }

        if (index == -1){
            return "";
        }
        else{
            output = s1.substring(index);
            return output;
        }

    }
}
