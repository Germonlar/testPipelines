package org.example;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        //int[] arr = {1,3,5,-2,-2,5,5,3,-1};
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        MaximumSumSubArray obj = new MaximumSumSubArray();

        int maxSum = obj.maxSubArray(arr);

        System.out.println(maxSum);
    }


    public int maxSubArray(int[] nums) {
      int maxSoFar = nums[0];
      int currentSum = nums[0];

      for(int i = 0; i < nums.length; i++){
          if(currentSum < 0){
              currentSum = 0;
          }

          currentSum += nums[i];

          if(currentSum > maxSoFar){
              maxSoFar = currentSum;

          }
      }
      return maxSoFar;
    }
}
