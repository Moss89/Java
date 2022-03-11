package test_06488587;

import java.sql.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    int[] myArray = new int[]{1, 2, 3, 4, 5, 5};
        System.out.println(findDuplicates(myArray));

}

    public static ArrayList findDuplicates(int[] array){
            ArrayList<Integer> myList = new ArrayList<>();
            Set<Integer> mySet = new HashSet<>();
            for(int number : array) {
                if (!mySet.contains(number)) {
                    mySet.add(number);
                } else {
                    if (!myList.contains(number)) {
                        myList.add(number);
                    }
                }
            }
            return myList;
            }
        }