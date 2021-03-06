package com.bala.algorithms.learning_algorithms.union_find;

/***
 * 
 * this algorithm take quadratic time to union object. its not an efficient
 * algorithm.
 * 
 * @author bala
 * 
 * 
 *
 */
public class QuickFindUF {

	int[] id;

	public QuickFindUF(int n) {
		id = new int[n];
		for (int i = 0; i < n; i++)
			id[i] = i;
	}

	// two objects are connected if their numbers are equal.
	public boolean connected(int p, int q) {
		return (id[p] == id[q]);
	}

	/**
	 * 
	 * this method connects 2 elements. iterate all the elements in the array
	 * and if the elment matches the given element p then change that element
	 * with q element, so that they both connected each other.
	 * 
	 * @param p
	 * @param q
	 * 
	 * 
	 */
	public void union(int p, int q) {
		int pid = id[p];
		int qid = id[q];

		for (int i = 0; i < id.length; i++) {
			if (id[i] == pid)
				id[i] = qid;
		}
	}

	public void display() {
		for (int i = 0; i < id.length; i++)
			System.out.print(id[i] + " ");
		System.out.println();
	}
}
