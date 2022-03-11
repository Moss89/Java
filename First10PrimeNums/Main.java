public class Main {

    public static void main(String[] args)
    {
      int primeCount = 0;
      for (int i = 0;  primeCount < 10; i++){
          if (isPrime(i)) {
              System.out.println("Prime Number: " + i );
              primeCount++;
          }
          }
      }

    public static boolean isPrime(int number){
        for (int i = 2; i<= number/2; i++){
            if (number%i == 0){
                return false;
            }
        }
        return true;
    }
}
