package com.bala.algorithms.learning_algorithms.sortings;

public class InsertionSort {

	int nElem;
	int[] array;

	public InsertionSort(int max) {
		array = new int[max];
	}

	public void insert(int val) {
		array[nElem] = val;
		nElem++;
	}

	public void display() {
		for (int i = 0; i < nElem; i++)
			System.out.print(array[i] + ",");
		System.out.println("");
	}

	public void sort() {
		int temp,i;
		for (int j = 1; j < nElem; j++) {
			temp = array[j];
			i = j;
			while (i > 0 && array[i - 1] >= temp) {
				array[i] = array[i - 1];
				--i;
			}
			array[i] = temp;
		}
	}
}
