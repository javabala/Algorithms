package com.bala.algorithms.learning_algorithms.sortings;

import org.junit.Before;
import org.junit.Test;

public class SelectionSortTest {

	SelectionSort selectionSort;
	
	@Test
	public void sort(){
		selectionSort.sort();
		System.out.println("After sorting");
		selectionSort.display();
	}
	
	@Before
	public void setup(){
		selectionSort = new SelectionSort(50);
		selectionSort.insert(34);
		selectionSort.insert(12);
		selectionSort.insert(76);
		selectionSort.insert(23);
		selectionSort.insert(90);
		System.out.println("Before sorting");
		selectionSort.display();
	}
}
