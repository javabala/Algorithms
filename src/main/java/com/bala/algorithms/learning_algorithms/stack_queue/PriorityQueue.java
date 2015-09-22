package com.bala.algorithms.learning_algorithms.stack_queue;

/***
 * 
 * This priority queue is not efficient for larger number of elements. Heap DS
 * is the best approach for that case. this is simple demonstration of priority
 * queue. smallest element is the priority in this case.
 * 
 * @author bala
 * 
 *
 */
public class PriorityQueue {

	int[] queue;
	int max;
	int nItem;

	public PriorityQueue(int max) {
		this.queue = new int[max];
		this.max = max;
		this.nItem = 0;
	}

	public void insert(int val) {
		int i;
		if (nItem == 0)
			queue[nItem++] = val;
		else {
			for (i = nItem - 1; i >= 0; i--) {
				if (val > queue[i])
					queue[i + 1] = queue[i];
				else
					break;
			}
			queue[i + 1] = val;
			nItem++;
		}

	}

	public int remove() {
		return queue[--nItem];
	}

	public int peekMin() {
		return queue[nItem - 1];
	}

	public int peek() {
		return queue[nItem];
	}

	public boolean isFull() {
		return nItem == max;
	}

	public boolean isEmpty() {
		return nItem == 0;
	}

	public void display() {
		for (int i = 0; i < nItem; i++)
			System.out.print(queue[i] + " ");
		System.out.println("");
	}
}
