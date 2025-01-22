package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class SumOfTwo {

    public static void main(String[] args) {
        int[] inputArr = new int[]{1, 2, 3, 5};
        System.out.println(Arrays.toString(sumOfTwo(inputArr, 4))); // [1, 3]

        inputArr = new int[] {7, 7, 4, 3, 8};
        System.out.println(Arrays.toString(sumOfTwo(inputArr, 7))); // [4, 3]

        inputArr = new int[] {13, 43, 2, 71};
        System.out.println(Arrays.toString(sumOfTwo(inputArr, 84))); // [13, 71]
    }

    public static int[] sumOfTwo(int[] arr, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(Integer num: arr){
            int complement = target - num;

            if(map.containsKey(complement)){
                return new int[]{complement,num};
            }
            map.put(num,1);

        }
        return new int[]{0,0};
    }


}
