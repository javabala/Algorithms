package com.bala.algorithms.learning_algorithms.stack_queue;

public class CharStack {

	char[] stackArry;
	int top = -1,max;
	
	public CharStack(int max){
		stackArry = new char[max];
		this.max = max;
	}
	
	public void push(char val){
		stackArry[++top] = val;
	}
	
	//return the top element and delete the element from stack
	public char pop(){
		return stackArry[top--];
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public boolean isFull(){
		return top == max - 1;
	}
	
	//return the top element without delete the element from stack
	public int peek(){
		return stackArry[top];
	}
}
