public class Q2 {

    public static void main(String[] args) {
        int perfectNums = 0;
    for (int i = 0; perfectNums < 4; i++ ){
        if (isPerfectNumber(i)){
            System.out.println("Perfect Number: " + i);
            perfectNums++;
        }
    }
    }

    public static boolean isPerfectNumber(int number){
        int sum = 0;
        for (int i = 1; i <= number/2; i++){
            if (number%i==0){
                sum += i;
            }
        }
        if(sum == number){
            return true;
        }
        return false;
    }
}
