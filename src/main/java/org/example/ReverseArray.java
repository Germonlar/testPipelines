package org.example;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] inputArr = new int[] {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(inputArr)); // [1, 2, 3, 4, 5]
        revArr(inputArr);
        System.out.println(Arrays.toString(inputArr)); // [5, 4, 3, 2, 1]
    }

    public static void revArr(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;


            start++;
            end--;

            String var1;


            String var;

        }
    }
}
