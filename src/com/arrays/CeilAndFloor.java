package com.arrays;

public class CeilAndFloor {
	
	public static int ceil(int[] arr, int key) {
		
		int low = 0;
		int high = arr.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(key == arr[mid]) {
				return mid;
			}else if(key<arr[mid]) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		if(low<arr.length) {
			return arr[low];
		}else {
			return -1;
		}
	}
	
public static int floor(int[] arr, int key) {
		
		int low = 0;
		int high = arr.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(key == arr[mid]) {
				return mid;
			}else if(key<arr[mid]) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		if(high>=0) {
			return arr[high];
		}else {
			return -1;
		}
	}

	public static void main(String[] args) {
		int[] arr = {12,15,18,20,38,49,56,68};
		int key = 11;
		System.out.println(ceil(arr, key));
		System.out.println(floor(arr, key));
	}

}
