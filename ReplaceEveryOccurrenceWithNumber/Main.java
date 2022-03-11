package com.Tom;

public class Main {
    public static void main (String[] args) {
        // test cases

        // Should return: "M1ss2ss3pp4"
        System.out.println(replace("Mississippi", 'i'));

        // Should return: "Hello World"
        System.out.println(replace("Hello World", 'w'));

        // Should return: "1134"
        System.out.println(replace("1234", '2'));
    }

    // write this method
    public static String replace(String str, char ch) {

        int changeChar = 1;
        String newString = "";
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ch){
                newString += changeChar;
                changeChar += 1;
            }
            else{
                newString += str.charAt(i);
            }
        }

        return newString;
    }
}
