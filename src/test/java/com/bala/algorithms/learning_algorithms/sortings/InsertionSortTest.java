package com.bala.algorithms.learning_algorithms.sortings;

import org.junit.Before;
import org.junit.Test;

public class InsertionSortTest {

	InsertionSort insertionSort;
	
	@Test
	public void sort(){
		insertionSort.sort();
		System.out.println("After sorting");
		insertionSort.display();
	}
	
	@Before
	public void setup(){
		insertionSort = new InsertionSort(50);
		insertionSort.insert(34);
		insertionSort.insert(12);
		insertionSort.insert(76);
		insertionSort.insert(23);
		insertionSort.insert(90);
		System.out.println("Before sorting");
		insertionSort.display();
	}
}
