package com.cy.algorithm.sort;

/**
 * 插入排序
 * 将一个数据插入到一个已经排序好的序列中，得到的新的序列仍然是一个已排好序的数列
 * @author chenyou
 *
 */
public class InsertSort {
	public static void insertSort(int[] array) {
		for(int j = 1; j < array.length; j++) {
			int i = j - 1;
			int temp = array[j];
			
			/**
			 * 如果当前的最后一个数还是比要插入的数大，则将这个数向后移动一位
			 * 直到找到小于要插入的数时或者是到达数组的第一个数时退出循环，然后把数插入
			 */
			while(i >= 0 && array[i] > temp) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] a = new int[]{2, 8, 7, 1, 3, 5, 6, 4};
		
		insertSort(a);
		
		for(int i : a) {
			System.out.print(i + " ");
		}
	}
}
