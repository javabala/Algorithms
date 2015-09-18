package com.bala.algorithms.learning_algorithms.stack_queue;

public class BraceChecker {

	CharStack stack = new CharStack(50);

	public void checkBrace(String braceString) {
		for (int i = 0; i < braceString.length(); i++) {
			char c = braceString.charAt(i);
			switch (c) {
			case '(':
			case '{':
			case '[':
				stack.push(c);
				break;
			case ')':
			case '}':
			case ']':
				if (!stack.isEmpty()) {
					char popChar = stack.pop();
					if ((c == '}' && popChar != '{') || (c == ']' && popChar != '[') || (c == ')' && popChar != '('))
						System.out.println(" Error char " + c + " at : " + i);
				} else {
					System.out.println(" Error char " + c + " at : " + i);
				}
				break;
			default:
				break;
			}
		}
		if (!stack.isEmpty())
			System.out.println("Error : missing delimiter");
	}

}
