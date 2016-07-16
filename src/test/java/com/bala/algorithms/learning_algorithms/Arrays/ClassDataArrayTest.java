package com.bala.algorithms.learning_algorithms.Arrays;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class ClassDataArrayTest {

	ClassDataArray dArray;
	
	@Test
	public void searchPerson(){
		Assert.assertEquals("bbb",dArray.searchPerson("bbb").getLast());
	}
	
	@Test
	public void deletePerson(){
		Assert.assertTrue(dArray.delete("bbb"));
		dArray.display();
	}
	
	@Before
	public void setup(){
		dArray = new ClassDataArray(30);
		dArray.insert("aaa", "aaa", 28);
		dArray.insert("bbb", "bbb", 25);
		dArray.insert("ccc", "ccc", 29);
		dArray.insert("ddd", "ddd", 34);
		dArray.insert("eee", "eee", 21);
		dArray.display();
	}
}
