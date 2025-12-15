package com.arrays;

import java.util.Scanner;

public class LinearSearch {
	public static int linearSearch(int[] arr, int target) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {10,20,30,40,50};
		int target = scan.nextInt();

		System.out.println(linearSearch(arr, target));
	}

}
