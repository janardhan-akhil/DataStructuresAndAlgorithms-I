package com.arrays;

public class MoveZerosToEnd {
	public static void moveZerosToEnd(int[] arr) {
		if(arr.length == 0 || arr.length == 1) {
			return;
		}
		int j = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] !=0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j++] = temp;
			} 
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		int[] arr = {1,2,0,2,0,3,0,0,5,0,4,0,4};
		moveZerosToEnd(arr);
	}

}
