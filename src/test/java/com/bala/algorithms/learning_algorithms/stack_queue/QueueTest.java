package com.bala.algorithms.learning_algorithms.stack_queue;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class QueueTest {

	Queue queue;
	
	@Test
	public void testAInsert(){
		queue.insert(69);
		System.out.println("after insert");
		queue.display();
	}
	
	@Test
	public void testBRemove(){
		queue.remove();
		System.out.println("after removed");
		queue.display();
	}
	
	@Before
	public void setup(){
		queue = new Queue(10);
		queue.insert(34);
		queue.insert(45);
		queue.insert(27);
		queue.insert(78);
		System.out.println("setup queue");
		queue.display();
	}
}
