package com.bala.algorithms.learning_algorithms.lists;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.bala.algorithms.learning_algorithms.lists.LinkedList.Link;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LinkedListTets {

	LinkedList linkList;
	
	@Test
	public void testAInsert(){
		linkList.insertFirst(78, 78.0);
		linkList.insertFirst(28, 28.0);
		System.out.println("after insert");
		linkList.displayList();
	}
	
	@Test
	public void testBDelete(){
		Link delLink = linkList.delete();
		System.out.println("deleted ");
		delLink.displayLink();
		System.out.println("after delete");
		linkList.displayList();
	}
	
	@Test
	public void testCsearch(){
		Link found = linkList.find(54);
		System.out.println("Found");
		found.displayLink();
	}
	
	@Test
	public void testFfindDelete(){
		Link fDelete = linkList.findDelete(34);
		System.out.println("Found and deleted ");
		fDelete.displayLink();
		System.out.println("after delete");
		linkList.displayList();
	}
	
	@Before
	public void setup(){
		linkList = new LinkedList();
		linkList.insertFirst(34, 34.0);
		linkList.insertFirst(55, 55.0);
		linkList.insertFirst(13, 55.0);
		linkList.insertFirst(11, 55.0);
		System.out.println("setup list");
		linkList.displayList();
	}
}
