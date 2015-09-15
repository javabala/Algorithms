package com.bala.algorithms.learning_algorithms.Arrays;

public class HighArray {

	private int nElems;
	private int[] array;

	public HighArray(int max) {
		this.array = new int[max];
		this.nElems = 0;
	}

	public void add(int value) {
		array[nElems] = value;
		nElems++;
	}

	public boolean search(int searchKey) {
		int i = 0;
		for (; i < nElems; i++) {
			if (array[i] == searchKey) {
				System.out.println("Element" + searchKey + " found at : " + (i + 1));
				break;
			}
		}
		if (i == nElems)
			return false;
		else
			return true;
	}

	public boolean delete(int value) {
		int i = 0;
		for (; i < nElems; i++) {
			if (value == array[i])
				break;
		}

		if (i == nElems)
			return false;
		else {
			for (int j = i; j < nElems; j++) {
				array[j] = array[j + 1];
			}
			nElems--;
			return true;
		}
	}

	public void disaply() {
		for (int i = 0; i < nElems; i++)
			System.out.print(array[i] + ", ");
		System.out.println("");
	}

}
