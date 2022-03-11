import java.util.Arrays;

public class SmallestInterger {
    public static void main(String[] args) {
        int[] A = {1, 3, 6, 4, 1, 2};
        System.out.println(solution(A));


        }
   static public int solution(int[] A){
        int smallest
                = 1;
        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            if (smallest == A[i]) {
                smallest++;
            }
        }
        return smallest;
    }
}