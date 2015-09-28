package com.bala.algorithms.learning_algorithms.lists;

public class DoubleEndedList {

	private Link first;
	private Link last;

	public boolean isEmpty() {
		return first == null;
	}

	public void insertFirst(double data) {
		Link link = new Link(data);
		if (isEmpty())
			last = link;
		link.next = first;
		first = link;
	}

	public void insertLast(double data) {
		Link link = new Link(data);
		if (isEmpty())
			first = link;
		else
			last.next = link;
		last = link;
	}

	public Link deleteFirst() {
		Link link = first;
		if (first.next == null)
			last = null;
		first = first.next;
		return link;
	}

	public Link deleteLast() {
		Link current = first;
		Link previous = first;
		while (current != last) {
			previous = current;
			current = current.next;
		}
		last = previous;
		previous.next = null;
		return current;
	}

	public void displayList() {
		Link current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
	}

	class Link {
		private double dData;
		private Link next;

		public Link(double dData) {
			this.dData = dData;
		}

		public void displayLink() {
			System.out.println("Data : " + dData);
		}
	}

}
