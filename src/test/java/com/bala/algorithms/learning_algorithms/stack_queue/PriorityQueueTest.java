package com.bala.algorithms.learning_algorithms.stack_queue;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PriorityQueueTest {

	PriorityQueue pQueue;
	
	@Test
	public void insertATest(){
		pQueue.insert(12);
		System.out.println("after insert");
		pQueue.display();
	}
	
	@Test
	public void removeBTest(){
		pQueue.remove();
		System.out.println("after remove");
		pQueue.display();
	}
	
	@Test
	public void peekCTest(){
		pQueue.peek();
		System.out.println("after peek");
		pQueue.display();
	}
	
	@Before
	public void setup(){
		pQueue = new PriorityQueue(10);
		pQueue.insert(67);
		pQueue.insert(56);
		pQueue.insert(78);
		pQueue.insert(96);
		pQueue.insert(14);
		System.out.println("setup pqueue");
		pQueue.display();
	}
	
}
