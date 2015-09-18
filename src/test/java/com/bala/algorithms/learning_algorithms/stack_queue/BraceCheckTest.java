package com.bala.algorithms.learning_algorithms.stack_queue;

import org.junit.Before;
import org.junit.Test;

public class BraceCheckTest {

	BraceChecker checker;

	@Test
	public void checkBrace() {
		String braceString = "(function{ alert(hi)})";
		checker.checkBrace(braceString);
	}

	@Before
	public void setup() {
		checker = new BraceChecker();
	}
}
