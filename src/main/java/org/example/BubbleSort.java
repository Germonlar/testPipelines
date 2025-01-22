package org.example;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arrNum = {6, 5, 2, 1, 9, 10, 0};
//        System.out.println(Arrays.toString(arrNum)); // [6, 5, 2, 1, 9, 10, 0]
        bSort(arrNum);
        System.out.println(Arrays.toString(arrNum)); // [0, 1, 2, 5, 6, 9, 10]
    }

    public static void bSort(int[] arr) {
        int swapCounter = -1;
        int unsortedArrLength = arr.length;

        while (swapCounter != 0){
            swapCounter =0;

            for (int i = 0; i < unsortedArrLength - 1; i++){
                if(arr[i] > arr[i+1]){
                    int tmp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = tmp;

                    swapCounter++;
                }
            }
            unsortedArrLength--;
        }
    }
}
