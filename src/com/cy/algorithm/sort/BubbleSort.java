package com.cy.algorithm.sort;

/**
 * 冒泡排序
 * 存在10个气泡，由底至上把较小的数据逐步往上升，这样经过一次排序之后，这样最小的气泡就会被上升到顶（下标0）
 * 然后再从底向上升，直到排序完成
 * 它的最坏时间复杂度是O（n^2）
 * 它是稳定的排序算法
 * @author cy
 *
 */
public class BubbleSort {
	public static void bubbleSort(int[] a) {
		for(int i = 0; i < a.length; i++) {
			for(int j = a.length - 1; j > i; j--) {
				if(a[j] < a[j - 1]) {
					int temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
				}
			}
		}
	}
	
	/**
	 * 对冒泡排序进行优化，设置一个标志位，如果一趟发生了交换则为true，否则为false，如果
	 * 有一趟没有发生交换说明排序已完成
	 * 优化最好的时间复杂度为O(n)
	 * @param a
	 */
	/**
	 * @param a
	 */
	public static void bubbleSort2(int[] a) {
		boolean flag = true;
		int k = 0;
		while(flag) {
			flag = false;
			for(int i = a.length - 1; i > k; i-- ) {
				if(a[i] < a[i - 1]) {
					int temp = a[i - 1];
					a[i - 1] = a[i];
					a[i] = temp;
					flag = true;
				}
			}
			k++;
		}
	}
	
	public static void main(String[] args) {
		int[] a = new int[]{2, 8, 7, 1, 3, 5, 6, 4};
		
//		bubbleSort(a);
		bubbleSort2(a);
		for(int i : a) {
			System.out.print(i + " ");
		}
	}
}
