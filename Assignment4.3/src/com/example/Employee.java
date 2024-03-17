package com.example;

//import java.util.Scanner;

public class Employee {
	
	//Fields / Instance Variables.
	String name;
	int empid;
	double salary;
	
	// Instance methods Overloading
	private void setDetails() {
		System.out.println("setDetails()");
		/*private Scanner sc = new Scanner(System.in);
		this.name = sc.nextLine();
		this.empid = sc.nextInt();
		this.salary = sc.nextDouble();
		*/
		this.name = "Rahul";
		this.empid = 121;
		this.salary = 62732.23;
	}

	private void setDetails(int i, String string, double d) {
		System.out.println("setDetails(int i, String string, double d)");
		this.name = string;
		this.empid = i;
		this.salary = d;
		
	}

	private void setDetails(String string, int i, double d) {
		System.out.println("setDetails(String string, int i, double d)");
		this.name = string;
		this.empid = i;
		this.salary = d;
	}
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		
		employee.setDetails();
		employee.setDetails("Rahul", 121, 34592.43);
		employee.setDetails( 121, "Rahul", 34592.43);
		
		
	}

}
