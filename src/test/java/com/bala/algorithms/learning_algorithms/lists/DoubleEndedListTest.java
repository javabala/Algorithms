package com.bala.algorithms.learning_algorithms.lists;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.bala.algorithms.learning_algorithms.lists.DoubleEndedList.Link;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DoubleEndedListTest {

	DoubleEndedList deList;
	
	@Test
	public void testAInsertFirst(){
		deList.insertFirst(33.0);
		System.out.println("after insert first");
		deList.displayList();
	}
	
	@Test
	public void testBInsertLast(){
		deList.insertLast(45.0);
		System.out.println("after insert last");
		deList.displayList();
	}
	
	@Test
	public void testCDeleteFirst(){
		deList.deleteFirst();
		System.out.println("after delete first");
		deList.displayList();
	}
	
	@Test
	public void testDDeleteLast(){
		Link lastDel = deList.deleteLast();
		System.out.println("deleted ");
		lastDel.displayLink();
		System.out.println("after delete last");
		deList.displayList();
	}
	
	@Before()
	public void setup(){
		deList = new DoubleEndedList();
		deList.insertFirst(12.0);
		deList.insertFirst(16.0);
		deList.insertFirst(17.0);
		System.out.println("setup list");
		deList.displayList();
	}
}
