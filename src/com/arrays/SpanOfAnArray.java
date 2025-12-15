package com.arrays;

public class SpanOfAnArray {
	public static int spanOfArray(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return max-min;
	}

	public static void main(String[] args) {
		int[] arr = {23,20,4,1,5,6,99,5,7};
		System.out.println(spanOfArray(arr));
		

	}

}
