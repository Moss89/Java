public class Main {

    public static void main(String[] args) {
        int[] myTest = {1,1,2,3,5,6,6,7,5,3};
        System.out.println(findDistinct(myTest));
    }

    public static String findDistinct(int[] inputArray) {
        boolean[] foundArray = new boolean[10];
        for (int i = 0; i < foundArray.length; i++) {
            foundArray[i] = false;
        }
        for (int j = 0; j < inputArray.length; j++) {
            int num = inputArray[j];
            foundArray[num] = true;
        }
        String result = "";
        for (int k = 0; k < foundArray.length; k++) {
            if (foundArray[k]) {
                result += k + " ";
            }
        }
        return result;
    }
}
