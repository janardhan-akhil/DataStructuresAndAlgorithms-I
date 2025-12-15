package com.arrays;

public class WoodCutting {
	
	public static int findWoodCount(int[] arr, int mid) {
		int wc = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>mid) {
				wc = wc+(arr[i]-mid);
			}
		}
		return wc;
	}
	
	public static int machineHeight(int[] arr, int key) {
		int max = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		int l=0, h=max, mid = 0;
		while(l<=h) {
			mid = (l+h)/2;
			int wc = findWoodCount(arr, mid);
			if(wc == key || l == mid) {
				return mid;
			}else if(wc>key){
				l = mid;
			}else {
				h = mid;
			}
		}
		return -1;
		
		
	}

	public static void main(String[] args) {
		int[] arr = {20,15,10,17};
		int key = 8;
		System.out.println(machineHeight(arr, key));
		

	}

}
