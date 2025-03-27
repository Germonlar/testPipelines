package org.example;

public class MajorityElement {

    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2,1,5,1,3};
        int var = majorityElement(arr);
        System.out.println(var);
    }
    public static int majorityElement(int[] nums) {
        int mc = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == mc) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    mc = nums[i];
                    count = 1;
                }
            }
        }
        return mc;
    }
}
