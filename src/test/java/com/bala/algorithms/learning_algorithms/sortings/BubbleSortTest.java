package com.bala.algorithms.learning_algorithms.sortings;

import org.junit.Before;
import org.junit.Test;

public class BubbleSortTest {

	BubbleSort bubbleSort;
	
	@Test
	public void sort(){
		bubbleSort.sort();
		System.out.println("After sorting");
		bubbleSort.display();
	}
	
	@Before
	public void setup(){
		bubbleSort = new BubbleSort(50);
		bubbleSort.insert(34);
		bubbleSort.insert(12);
		bubbleSort.insert(76);
		bubbleSort.insert(23);
		bubbleSort.insert(90);
		System.out.println("Before sorting");
		bubbleSort.display();
	}
}
