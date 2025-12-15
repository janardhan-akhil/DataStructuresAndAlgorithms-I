package com.arrays;

public class MajorityElement {
	public static int majorityElement(int[] arr) {
		int count = 1;
		int ele = arr[0];
		for(int i =1;i<arr.length;i++) {
			if(arr[i] == ele) {
				count++;
			}else {
				count--;
			}
			if(count == 0) {
				ele = arr[i];
				count = 1;
			} 
		}
		return ele;
	}

	public static void main(String[] args) {
		int[] arr = {2,2,1,1,1,1,2,2};
		int res = majorityElement(arr);
		System.out.println(res);

	}

}
