package com.bala.algorithms.learning_algorithms.Arrays;

public class OrderedArray {

	int nElem = 0;
	int[] array;

	public OrderedArray(int max) {
		array = new int[max];
	}

	//Binary search since its ordered array
	public int find(int searchKey) {
		int lowerBound = 0;
		int upperBound = nElem - 1;

		while (true) {
			int searchPos = (lowerBound + upperBound) / 2; //divide element by 2
			if (array[searchPos] == searchKey)
				return searchPos;
			else if (lowerBound > upperBound)
				return nElem;
			else {
				if (array[lowerBound] < searchKey) 
					lowerBound = searchPos + 1;// search element from left side
				else if (array[lowerBound] > searchKey)
					upperBound = searchPos - 1;// search element from right side
			}

		}
	}

	public void insert(int value) {
		int i = 0;
		for (; i < nElem; i++) {
			if (array[i] > value) // find suitable position
				break;
		}

		// looping element from end to search pos and shift element from lower one position
		for (int j = nElem; j > i; j--)
			array[j] = array[j - 1];

		array[i] = value;
		nElem++;
	}

	public boolean delete(int value) {
		int elePos = find(value);
		if (elePos == nElem)
			return false;
		else {
			//looping elements from search pos to end elements and shift them lower one position
			for (int i = elePos; i < nElem; i++)
				array[i] = array[i + 1];
			nElem--;
			return true;
		}
	}

	public void display() {
		for (int i = 0; i < nElem; i++)
			System.out.print(array[i] + ", ");
		System.out.println("");
	}
}
