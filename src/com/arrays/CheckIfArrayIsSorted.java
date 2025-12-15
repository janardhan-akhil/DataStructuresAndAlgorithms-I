package com.arrays;

public class CheckIfArrayIsSorted {
	public static boolean checkIfArrayIsSorted(int[] arr) {
		for(int i = 1;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				return false;
			}
		}
		return true;
	}
	
	public static void reverseArray(int[] arr) {
		int i = 0, j=arr.length-1;
		while(i<=j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6,7,8};
		//System.out.println(checkIfArrayIsSorted(arr));
		reverseArray(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
