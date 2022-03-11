import java.util.Arrays;

    public class Main {
        public static void main (String[] args) {
            // test cases

            // should return: [], i.e. an array with zero elements
            System.out.println("test case 1: " + Arrays.toString(getDistinctLCLetters("")));

            // should return: [], i.e. an array with zero elements
            System.out.println("test case 2: " + Arrays.toString(getDistinctLCLetters("BEE")));

            // should return: [e]
            System.out.println("test case 3: " + Arrays.toString(getDistinctLCLetters("Bee")));

            // should return: [d, e, l, o, r]
            System.out.println("test case 4: " + Arrays.toString(getDistinctLCLetters("Hello World!")));
        }

        // write this method
        public static char[] getDistinctLCLetters(String str) {

            if (str == null){
                return new char[0]; // i.e. an array with zero elements
            }
            else {
                boolean[] present = new boolean[26];


                for (int i = 0; i < str.length(); i++) {
                    if (Character.isLowerCase(str.charAt(i)) && Character.isAlphabetic(str.charAt(i))) {
                        present[str.charAt(i)- 'a'] = true;
                    }
                }

                int countTrue = 0;
                for (boolean t:present){
                    if (t) {
                        countTrue++;
                    }
                }


                char[] lowercaseArray = new char[countTrue];
                int j = 0;
                for(int i = 0; i< present.length; i++){
                    if(present[i]){
                        lowercaseArray[j++] = (char)('a' + i);
                    }
                }

                return lowercaseArray;
            }
        }
    }