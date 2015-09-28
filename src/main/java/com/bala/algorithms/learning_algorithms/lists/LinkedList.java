package com.bala.algorithms.learning_algorithms.lists;

public class LinkedList {

	private Link first;
	
	public void insertFirst(int iData,double dData){
		Link link = new Link(iData,dData);
		link.next = first;
		first = link;
	}
	
	public void displayList(){
		Link current = first;
		while(current != null){
			current.displayLink();
			current = current.next;
		}
	}
	
	public Link find(int find){
		Link current = first;
		while(current.iData != find){
			if(current.next != null)
				current = current.next;
			else
				return null;
		}
		return current;
	}
	
	public Link findDelete(int find){
		Link current = first;
		Link previous = first;
		while(current.iData != find){
			if(current.next == null)
				System.out.println("Item not found");
			else{
				previous = current;
				current = current.next;
			}
		}
		if(current == first)
			first = first.next;
		else
			previous.next = current.next;
		return current;
		
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public Link delete(){
		Link temp = first;
		first = temp.next;
		return temp;
	}
	
	class Link {
		private int iData;
		private double dData;
		private Link next;
		
		public Link(int iData,double dData){
			this.iData = iData;
			this.dData = dData;
		}
		
		public void displayLink(){
			System.out.println(" iData : "+iData+" and dData : "+dData);
		}
		
	}
	
	
}

