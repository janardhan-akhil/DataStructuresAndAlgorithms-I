package com.arrays;

public class LongestConcecutiveEvenOddSubArraySum {
	public static int longestEvenOddLength(int[] arr) {
		int count = 1, maxCount = 1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]%2==0 && arr[i-1]%2 != 0 ||
					arr[i]%2 != 0 && arr[i-1]%2 == 0) {
				count++;
				maxCount = Math.max(maxCount, count);
			}else {
				count = 1;
			}
		}
		return maxCount;
	}

	public static void main(String[] args) {
		int[] arr = {8,10,3,4,5};
		System.out.println(longestEvenOddLength(arr));
	}

}
