package com.arrays;

public class AllocateBooks {
	public static boolean isPossibleSol(int[] arr, int b, int mid) {
		int students = 1;
		int sbc = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > mid) {
				return false;
			}
			if (sbc + arr[i] <= mid) {
				sbc = sbc + arr[i];
			} else {
				students++;
				if (students > b) {
					return false;
				}
				sbc = arr[i];
			}
		}
		return true;
	}
	
	public static int maxPage(int[] arr, int b) {
		if(b>arr.length) {
			return -1;
		}
		int l=arr[0],h=0,mid = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<l) {
				l =arr[i];
			}
			h = h+arr[i];
		}
		
		int res = -1;
		while(l<=h) {
			mid = (l+h)/2;
			if(isPossibleSol(arr, b, mid) == true) {
				res = mid;
				h = mid-1;
			}else {
				l = mid+1;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 12, 34, 67, 90};
		int b = 2;
		System.out.println(maxPage(arr, b));
	}

}
