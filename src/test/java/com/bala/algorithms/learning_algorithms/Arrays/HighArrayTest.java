package com.bala.algorithms.learning_algorithms.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class HighArrayTest {

	HighArray array;
	
	@Test
	public void testSearch(){
		Assert.assertTrue(array.search(6));
		array.disaply();
	}
	
	@Test
	public void testDelete(){
		Assert.assertTrue(array.delete(10));
		array.disaply();
	}
	
	@Before
	public void init(){
		array = new HighArray(6);
		array.add(5);
		array.add(6);
		array.add(10);
		array.add(34);
		array.add(9);
	}
}
