package com.bala.algorithms.learning_algorithms.stack_queue;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StackTest {

	Stack stack;

	@Test
	public void test1Push() {
		System.out.println("pushing element into stack");
		if (!stack.isFull())
			stack.push(67);
		System.out.println("pushed element into stack");
		stack.display();
	}
	
	@Test
	public void test2Pop() {
		System.out.println("poping element from stack");
		int popedElem = 0;
		if (!stack.isEmpty())
			popedElem = stack.pop();
		System.out.println("poped element from stack "+popedElem);
		stack.display();
	}
	
	@Test
	public void test3Pop() {
		System.out.println("peeking element from stack");
		int peekedElem = 0;
		if (!stack.isEmpty())
			peekedElem = stack.peek();
		System.out.println("peeking element from stack "+peekedElem);
		stack.display();
	}


	@Before
	public void setup() {
		stack = new Stack(50);
		stack.push(34);
		stack.push(56);
		stack.push(90);
		stack.push(12);
		System.out.println("initial stack element");
		stack.display();
	}
}
