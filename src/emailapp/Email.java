package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	
	//Constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;
	System.out.println("EMAIL CREATED "+ this.firstName + " " + this.lastName);		
	
	//Selecting department
	this.department = setDepartment();
	System.out.println("Deparment: " + this.department);
	}
	
	//Ask for department
	private String setDepartment() {
		System.out.println("DEPARTMENT NUMBERS\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department number: ");
		Scanner in = new Scanner(System.in);
		int departmentChoice = in.nextInt();
		if(departmentChoice == 1) {return "sales";}
		else if(departmentChoice == 2) {return "dev";}
		else if(departmentChoice == 3) {return "acc";}
		else {return "";}
	}
	//Generate password
	
	//Set mailbox capacity
	
	//Set an alternate email
	
	//Change the password
	
}

