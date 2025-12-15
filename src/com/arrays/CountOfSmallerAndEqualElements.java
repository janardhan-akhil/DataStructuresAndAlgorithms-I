package com.arrays;

public class CountOfSmallerAndEqualElements {
	
	public static int countOfSmallerAndEqualElements(int[] arr, int key) {
		int l = 0; int h = arr.length-1; int mid = 0;
		while(l<=h) {
			mid = (l+h)/2;
			if(key == arr[mid]) {
				while(mid+1<arr.length && arr[mid+1]==key) {
					mid++;
				}
				break;
			}else if(key<arr[mid]) {
				h = mid-1;
			}else {
				l = mid+1;
			}
		}
		if(arr[mid]>key) {
			return mid;
		}else {
			return mid+1;
		}
	}

	public static void main(String[] args) {
		
		int[] arr = {2,6,12,24,26,26,28,30};
		int key = 25;
		System.out.println(countOfSmallerAndEqualElements(arr, key));

	}

}
