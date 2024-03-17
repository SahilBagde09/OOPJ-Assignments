package com.example;

public class Student {
	
	//Fields / Instance variables
	String name;
	int marks;
	int roll_number;
	
	public static void main(String[] args) {
		// Student class instance.
		Student student = new Student(); 
		
		// Assigning values to the instance variables.
		student.name = "Sahil Bagde"; 
		student.marks = 89;
		student.roll_number = 23;
		
		//Accessing values of instance variable with instance.
		System.out.println("Name:    " + student.name); 
		System.out.println("Marks:    " + student.marks);
		System.out.println("Roll Number:    " + student.roll_number);
		
	}
}
