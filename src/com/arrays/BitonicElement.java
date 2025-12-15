package com.arrays;

public class BitonicElement {

	public static int ascendindSearch(int[] arr, int key, int range) {
		int l = 0;
		int r = range;
		int mid = 0;
		while (l <= r) {
			mid = (l + r) / 2;
			if (key == arr[mid]) {
				return mid;
			} else if (key > arr[mid]) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		return -1;
	}

	public static int descendingSearch(int[] arr, int key, int range) {
		int l = range;
		int r = arr.length - 1;
		int mid = 0;
		while (l <= r) {
			mid = (l + r) / 2;
			if (key == arr[mid]) {
				return mid;
			} else if (key > arr[mid]) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return -1;

	}

	public static int findBitonicPoint(int[] arr) {
		int l = 0;
		int r = arr.length - 1;
		int mid = 0;
		while (l <= r) {
			mid = (l + r) / 2;
			if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
				return mid;
			} else if (arr[mid] > arr[mid + 1]) {
				r = mid;
			} else {
				l = mid;
			}
		}
		return -1;
	}

	public static int searchBitonic(int[] arr, int key, int bIndex) {
		if(key == arr[bIndex]) {
			return bIndex;
		}
		if(key > bIndex) {
			return -1;
		}
		
		int res1 = ascendindSearch(arr, key, bIndex-1);
		if(res1!=-1) {
			return res1;
		}
		int res2 = descendingSearch(arr, key, bIndex+1);
		if(res2!=-1) {
			return res2;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 6, 7, 5, 4, 3 };
		int key = 2;
		int bIndex = findBitonicPoint(arr);
		// System.out.println(ascendindSearch(arr,key,bIndex));
		//System.out.println(descendingSearch(arr, key, bIndex));
		System.out.println(searchBitonic(arr, key, bIndex));

	}

}
