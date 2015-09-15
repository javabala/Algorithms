package com.bala.algorithms.learning_algorithms.Arrays;

public class ClassDataArray {

	int nElem;
	Person[] persons;

	public ClassDataArray(int max) {
		persons = new Person[max];
	}

	public Person searchPerson(String lastName) {
		int i = 0;
		for (; i < nElem; i++) {
			if (persons[i].getLast().equals(lastName))
				break;
		}
		if (i == nElem)
			return null;
		else
			return persons[i];
	}

	public void insert(String fname, String lname, int age) {
		persons[nElem] = new Person(fname, lname, age);
		nElem++;
	}

	public boolean delete(String lname) {
		int i = 0;
		for (; i < nElem; i++) {
			if (persons[i].getLast().equals(lname))
				break;
		}
		if (i == nElem)
			return false;
		else {
			for (int j = i; j < nElem; j++)
				persons[j] = persons[j + 1];
			nElem--;
			return true;
		}

	}

	public void display() {
		for (int i = 0; i < nElem; i++)
			System.out.print(persons[i].getLast() + ", ");

		System.out.println("");
	}
}
