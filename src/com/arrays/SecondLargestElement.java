package com.arrays;

public class SecondLargestElement {
	public static int secondLargets(int[] arr) {
		int max = arr[0];
		int secMax = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max =arr[i];
			}
			if(arr[i]>secMax && arr[i]!=max) {
				secMax = arr[i];
			}
		}
		return secMax;
	}

	public static void main(String[] args) {
		int[] arr = {23,20,4,1,5,6,99,5,7};
		System.out.println(secondLargets(arr));

	}

}
