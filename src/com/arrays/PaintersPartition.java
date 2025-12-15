package com.arrays;

public class PaintersPartition {
	
	public static boolean isPossibleSol(int[] arr , int a, int mid) {
		int painters = 1;
		int pbc = 0;
		for(int i=0;i<arr.length;i++) {
			if(pbc+arr[i]<=mid) {
				pbc = pbc+arr[i];
			}else {
				painters++;
				if(painters >a) {
					return false;
				}else {
					pbc = arr[i];
				}
			}
		}
		return true;
	}
	
	public static int paintersPartition(int[] arr, int a, int b) {
		
		if(a>arr.length) {
			return -1;
		}
		int l = 0, h = 0, mid = 0;
		for(int i=0;i<arr.length;i++) {
			h = h+arr[i];
		}
		
		int res = -1;
		while(l<=h) {
			mid = (l+h)/2;
			if(isPossibleSol(arr, a, mid) == true) {
				res = mid;
				h = mid -1;
			}else {
				l = mid +1;
			}
		}
		return res*b;
	}
	public static void main(String[] args) {
		int[] arr = {10,20,30,40};
		int a = 2;
		int b = 2;
		System.out.println(paintersPartition(arr, a, b));

	}

}
