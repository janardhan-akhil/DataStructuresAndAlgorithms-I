package com.arrays;

public class MaxConcecutiveOnes {
	public static int maxConcecutiveOnes(int[] arr) {
		int count = 0, maxCount = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				count++;
			}else {
				maxCount = Math.max(maxCount, count);
				count = 0;
			}
		}
		maxCount = Math.max(maxCount, count);
		return maxCount;
	}

	public static void main(String[] args) {
		int[] arr = {1,1,0,1,1,1};
		int res = maxConcecutiveOnes(arr);
		System.out.println(res);
	}

}
