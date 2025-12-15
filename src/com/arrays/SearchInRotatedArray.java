package com.arrays;

public class SearchInRotatedArray {

	public static int searchElement(int[] arr, int key) {
		int l = 0;
		int h = arr.length - 1;
		int mid = 0;
		while (l <= h) {
			mid = (l + h) / 2;
			if (key == arr[mid]) {
				return mid;
			} else if (arr[l] <= arr[mid]) {
				if (arr[l] >= key && arr[mid] < key) {
					h = mid - 1;
				} else {
					l = mid + 1;
				}
			} else {
				if (arr[mid] < key && arr[h] >= key) {
					l = mid + 1;
				} else {
					h = mid - 1;
				}
			}

		}
		return -1;
	}

	public static int digitSum(int n) {
		int sum = 0;
		int digit = 0;
		while (n > 0) {
			int x = n % 10;
			sum = sum + x;
			n = n / 10;
		}

		if (sum < 10) {
			return sum;
		} else {
			digit = sum / 10;
		}

		return digit;

	}

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 0, 1, 2, 3 };
		int key = 8;
		int n = 987552699;
		// System.out.println(searchElement(arr, key));
		System.out.println(digitSum(n));

	}

}
