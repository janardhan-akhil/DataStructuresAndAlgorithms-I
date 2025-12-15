package com.arrays;


public class SlidingWindowTechnique {
	public static int maxSumOfSubArrayOfSizeK(int[] arr, int k) {
		int sum = 0, maxSum = 0;
		for(int i=0;i<k;i++) {
			sum = sum+arr[i];
		}
		for(int i=k;i<arr.length;i++) {
			sum = sum - arr[i-k]+arr[i];
			maxSum = Math.max(maxSum, sum);
		}
		return maxSum;
	}
	 public static boolean threeConsecutiveOdds(int[] arr) {
		 int count = 0, maxCount = 0;
	        for(int i=0;i<arr.length;i++){
	            if(arr[i]%2!=0 ){
	                count++;
	                maxCount = Math.max(maxCount, count);
	                if(maxCount == 3){
	                    return true;
	                }
	            }else{
	                count = 0;
	            }
	        }
	        return false;
	    }

	public static void main(String[] args) {
		int[] arr = {2,9,31,-4,21};
		int[] arr1 = {424,915,193,591,923};
		int k = 3;
	//System.out.println(maxSumOfSubArrayOfSizeK(arr, k));
		System.out.println(threeConsecutiveOdds(arr1));
	}

}
