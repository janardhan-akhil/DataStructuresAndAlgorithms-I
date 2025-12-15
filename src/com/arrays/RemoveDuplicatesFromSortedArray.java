package com.arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
	
	public static void removeDuplicates(int[] arr) {
		int rd = 0;
		for(int i=1;i<arr.length;i++) {
			if(arr[rd] != arr[i]) {
				rd++;
				arr[rd] = arr[i];
			}
		}
		for(int i=0;i<=rd;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		int[] arr = {1,2,2,3,4,4,5,5,6};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		removeDuplicates(arr);

	}

}
