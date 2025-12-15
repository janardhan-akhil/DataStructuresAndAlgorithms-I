package com.arrays;

public class FirstAndLastPositionOfElement {
	
	public static void searchRange(int[] arr, int key) {
		int[] res = {-1,-1};
		int l = 0;int h = arr.length-1; int mid =0;
		while(l<=h) {
			mid = (l+h)/2;
			if(key == arr[mid]) {
				res[0] = mid;
				h = mid-1;
			}else if(key<arr[mid]) {
				h = mid -1;
			}else {
				l = mid+1;
			}
		}
		
		 l = 0; h = arr.length-1; mid =0;
		while(l<=h) {
			mid = (l+h)/2;
			if(key == arr[mid]) {
				res[1] = mid;
				l = mid+1;
			}else if(key<arr[mid]) {
				h = mid -1;
			}else {
				l = mid+1;
			}
		}
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = {5,7,7,8,8,10};
		int key = 8;
		searchRange(arr, key);

	}

}
