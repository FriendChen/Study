package com.cy.algorithm.sort;

/**
 * 归并排序
 * 归并排序是建立在归并操作上的一种有效的排序算法，采用的是分治法思想
 * 将已有序的子序列合并，得到完全有序的序列
 * @author cy
 *
 */
public class MergeSort {
	public static void mergeSort(int[] a, int p, int r) {
		if(p < r) {
			int q = (p + r) / 2;
			mergeSort(a, p, q);
			mergeSort(a, q + 1, r);
			merge(a, p, q, r);
		}
	}
	
	/**
	 * 将两个子序列进行合并
	 * @param a
	 * @param p
	 * @param q
	 * @param r
	 */
	public static void merge(int[] a, int p, int q, int r) {
		//左边数组的大小
		int leftLength = q - p + 1;
		//右边数组的大小
		int rightLength = r - q;
		
		int[] left = new int[leftLength];
		int[] right = new int[rightLength];
		
		System.arraycopy(a, p, left, 0, leftLength);
		System.arraycopy(a, q + 1, right, 0, rightLength);
		
		int lIndex = 0;
		int rIndex = 0;
		while(lIndex < leftLength && rIndex < rightLength) {
			if(left[lIndex] <= right[rIndex]) {
				a[p++] = left[lIndex++];
			} else {
				a[p++] = right[rIndex++];
			}
		}
		
		//当合并后如果左边还没完，直接将左边还剩余的数插在数组后面
		while(lIndex < leftLength) {
			a[p++] = left[lIndex++];
		}
		//当合并后如果右边还没完，直接将右边还剩余的数插在数组后面
		while(rIndex < rightLength) {
			a[p++] = right[rIndex++];
		}
	}
	
	
	public static void main(String[] args) {
		int[] a = new int[]{2, 8, 7, 1, 3, 5, 6, 4};
		
		mergeSort(a, 0, a.length - 1);
		
		for(int i : a) {
			System.out.print(i + " ");
		}
	}
}
