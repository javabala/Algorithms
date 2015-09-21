package com.bala.algorithms.learning_algorithms.union_find;

import org.junit.Assert;
import org.junit.Test;

public class QuickFindUFTest {

	QuickFindUF qf = new QuickFindUF(10);
	
	public void union(){
		qf.display();
		qf.union(3, 6);
		qf.union(4, 2);
		qf.union(5, 7);
		qf.display();
	}
	
	@Test
	public void testConnection(){
		union();
		Assert.assertTrue(qf.connected(5, 7));
	}
	
	
	
	
}
