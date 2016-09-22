package com.cy.algorithm.sort;

/**
 * 快速排序的实现
 * 快速排序的思想：经过每一次划分之后，数组被分成两个部分，A[p,q-1]小于等于a[q],a[q+1, r]大于等于a[q]
 * @author cy
 *
 */
public class QuickSort {
	/**
	 * 递归实现快速排序
	 * @param a 带排序的数组
	 * @param p 数组的左起始下标
	 * @param r 数组的右下标
	 */
	public static void quickSort(int[] a, int p, int r) {
		if(p < r) {
			int q = partion(a, p, r);
			quickSort(a, p, q - 1);
			quickSort(a, q + 1, r);
		}
	}
	
	/**
	 * 将数组划分，找到q位置，使得经过这次划分后A[p,q-1]小于等于a[q],a[q+1, r]大于等于a[q]
	 * 每次都选定一个主元，然后从左向右找，使得大于a[r]的在左边，小于a[r]的在右边，最后将a[r]换到中间就完成了
	 * 一次划分
	 * @param a
	 * @param p
	 * @param r
	 * @return
	 */
	public static int partion(int[] a, int p, int r) {
		int x = a[r];
		int i = p - 1;
		int temp;
		for(int j = p; j < r; j++) {
			if(a[j] <= x) {
				i += 1;
//				a[i] = a[i] + a[j];
//				a[j] = a[i] - a[j];
//				a[i] = a[i] - a[j];
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		
		a[r] = a[i + 1];
		a[i + 1] = x;
		
		return i + 1;
	}
	
	
	public static void main(String[] args) {
		int[] a = new int[]{2, 8, 7, 1, 3, 5, 6, 4};
		
		quickSort(a, 0, a.length - 1);
		
		for(int index : a) {
			System.out.print(index + " ");
		}
	}
}
