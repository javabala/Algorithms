package com.bala.algorithms.learning_algorithms.Arrays;

public class Person {

	private String fname;
	private String lname;
	private int age;
	
	public Person(String fname, String lname, int age) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	
	public void displayPerson(){
		System.out.println("first name : "+fname);
		System.out.println("last name : "+lname);
		System.out.println("age : "+age);
	}
	
	public String getLast(){
		return lname;
	}
}
