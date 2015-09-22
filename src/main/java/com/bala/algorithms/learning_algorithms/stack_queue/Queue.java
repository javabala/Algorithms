package com.bala.algorithms.learning_algorithms.stack_queue;

public class Queue {

	int[] queueArray;
	int maxSize;
	int front,rear,nItems;
	
	public Queue(int max){
		this.maxSize = max;
		this.queueArray = new int[max];
		this.front = 0;
		this.rear = -1;
		this.nItems = 0;
	}
	
	public void insert(int val){
		if(rear == maxSize-1)
			rear = -1;
		queueArray[++rear] = val;
		nItems++;
	}
	
	public int remove(){
		if(front == maxSize-1)
			front = 0;
		nItems--;
		return queueArray[front++];
	}
	
	public int peek(){
		return queueArray[front];
	}
	
	public boolean isFull(){
		return nItems == maxSize -1;
	}
	
	public boolean isEmpty(){
		return nItems == 0;
	}
	
	public void display(){
		for(int i = 0; i < nItems; i++)
			System.out.print(queueArray[i]+" ");
		System.out.println("");
	}
}
