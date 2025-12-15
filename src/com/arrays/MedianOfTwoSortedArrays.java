package com.arrays;

public class MedianOfTwoSortedArrays {

	public static float median1(int[] arr1, int[] arr2) {
		int[] res = new int[(arr1.length + arr2.length)];
		int i = 0, k = 0, j = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				res[k++] = arr1[i++];
			} else {
				res[k++] = arr2[j++];
			}
		}
		while (i < arr1.length) {
			res[k++] = arr1[i++];
		}
		while (j < arr2.length) {
			res[k++] = arr2[j++];
		}
		int mid = 0;
		if (res.length % 2 == 0) {
			mid = res.length / 2;
			return (res[mid] + res[mid - 1]) / 2;
		} else {
			mid = res.length / 2;
			return res[mid];
		}
	}

	public static double median2(int[] arr1, int[] arr2) {
		if (arr2.length < arr1.length) {
			return median2(arr2, arr1);
		}

		int l = 0, h = arr1.length;
		while (l <= h) {
			int mid1 = (l + h) / 2;
			int mid2 = ((arr1.length + arr2.length + 1) / 2) - mid1;

			int l1 = (mid1 == 0) ? Integer.MIN_VALUE : arr1[mid1 - 1];
			int r1 = (mid1 == arr1.length) ? Integer.MAX_VALUE : arr1[mid1];
			int l2 = (mid2 == 0) ? Integer.MIN_VALUE : arr2[mid2 - 1];
			int r2 = (mid2 == arr2.length) ? Integer.MAX_VALUE : arr2[mid2];

			if (l1 <= r2 && l2 <= r1) {
				if ((arr1.length + arr2.length) % 2 == 0) {
					return (double) (Integer.max(l1, l2) + Integer.min(r1, r2))/2;
				} else {
					return (double)Integer.max(l1, l2);
				}
			} else if (l2 > r1) {
				l = mid1+1;
			} else {
				h = mid1-1;
			}
		}
		return 0.0D;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 10 };
		int[] arr2 = { 2, 6, 12, 16, 19, 25 };

		System.out.println(median1(arr1, arr2));
		System.out.println(median2(arr1, arr2));

	}

}
