package com.bala.algorithms.learning_algorithms.sortings;

public class SelectionSort {

	int nElem;
	int[] array;
	
	public SelectionSort(int max){
		array = new int[max];
	}
	
	public void insert(int val){
		array[nElem] = val;
		nElem++;
	}
	
	public void display(){
		for(int i=0;i<nElem;i++)
			System.out.print(array[i]+",");
		System.out.println("");
	}
	
	public void sort(){
		int i,j,shortest;
		
		for(i = 0;i < nElem; i++){
			shortest = i;
			for(j = i+1; j < nElem ; j++){
				if(array[j] < array[shortest])
					shortest = j;
			}
			swap(i,shortest);
		}
	}

	private void swap(int ele1, int ele2) {
		int temp = array[ele1];
		array[ele1] = array[ele2];
		array[ele2] = temp;
	}
}
