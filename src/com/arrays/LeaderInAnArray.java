package com.arrays;

public class LeaderInAnArray {
	public static void leadersInArray(int[] arr) {
		int currLeader = arr[arr.length-1];
		System.out.println(currLeader);
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]>currLeader) {
				currLeader = arr[i];
				System.out.println(currLeader);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 8, 11, 5, 11, 7, 6, 3 };
		leadersInArray(arr);

	}

}
