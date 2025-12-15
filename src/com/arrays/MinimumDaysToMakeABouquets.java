package com.arrays;

public class MinimumDaysToMakeABouquets {
	
	public static boolean isPossibleSol(int[] arr, int m , int k, int mid) {
		int adj = 0;
		int bqc = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=mid) {
				adj++;
				if(adj == k) {
					bqc++;
					if(bqc == m) {
						return true;
					}
					adj = 0;
				}
			}else {
				adj = 0;
			}
		}
		return false;
	}
	
	public static int makeBouquets(int[] arr, int m , int k) {
		int l = 0, h=0, mid = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<l) {
				l =arr[i];
			}
			if(arr[i]>h) {
				h = arr[i];
			}
		}
		int res = -1;
		while(l<=h) {
			mid = (l+h)/2;
			if(isPossibleSol(arr, m, k, mid) == true) {
				res = mid;
				h = mid -1;
			}else {
				l = mid+1;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = {2,5,2,9,3,10,4,6,5,6};
		int m = 4;
		int k = 2;
		System.out.println(makeBouquets(arr, m, k));
		
	}

}
