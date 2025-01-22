package org.example;

public class MaxNumber {

    public static void main(String[] args) {
        System.out.println(max(new int[] {4, 781, 8, 99, 103})); // 781
        System.out.println(max(new int[] {1, 2, 3, 4, 5})); // 5
        System.out.println(max(new int[] {3, 4})); // 4
        System.out.println(max(new int[] {100})); // 100
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
