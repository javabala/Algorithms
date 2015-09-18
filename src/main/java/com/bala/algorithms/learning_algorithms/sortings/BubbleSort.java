package com.bala.algorithms.learning_algorithms.sortings;

public class BubbleSort {

	int nElem;
	int[] array;
	
	public BubbleSort(int max){
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
		int out,in;
		for(out=nElem-1;out>1;out--){
			for(in=0;in<out;in++){
				if(array[in] > array[in+1])
					swap(in,in+1);
			}
		}
	}

	private void swap(int ele1, int ele2) {
		int temp = array[ele1];
		array[ele1] = array[ele2];
		array[ele2] = temp;
	}
}
