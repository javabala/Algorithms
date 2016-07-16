package com.bala.algorithms.learning_algorithms.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class OrderedArrayTest {

	OrderedArray ordArray;
	
	@Test
	public void searchElement(){
		Assert.assertEquals(1, ordArray.find(17));
	}
	
	@Test
	public void deleteEelement(){
		Assert.assertTrue(ordArray.delete(17));
		ordArray.display();
	}
	
	@Before
	public void setup(){
		ordArray = new OrderedArray(50);
		ordArray.insert(10);
		ordArray.insert(17);
		ordArray.insert(32);
		ordArray.insert(68);
		ordArray.display();
	}
}
