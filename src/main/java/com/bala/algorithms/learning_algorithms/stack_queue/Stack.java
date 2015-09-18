package com.bala.algorithms.learning_algorithms.stack_queue;

public class Stack {

	int[] stackArry;
	int top = -1,max;
	
	public Stack(int max){
		stackArry = new int[max];
		this.max = max;
	}
	
	public void push(int val){
		stackArry[++top] = val;
	}
	
	//return the top element and delete the element from stack
	public int pop(){
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
	
	public void display(){
		for(int i = 0; i < top+1; i++)
			System.out.print(stackArry[i]+",");
		System.out.println("");
	}
}
