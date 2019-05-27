package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	
	// Constructor to receive first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED " + this.firstName + " " + this.lastName);
	
		// Ask the department name from department Method
		this.department = setDepartment();
		System.out.println("DEPARTMENT : " + this.department);
		
		// Call method to return Random Password
		this.password = setRandomPassword(8);
		System.out.println("YOUR PASSWORD : " + this.password);
	}
	
	// Ask for the department
	private String setDepartment() {
		System.out.println("DEPARTMENT CODE :\n1 for sales\n2 for dev\n3 for Accounting\n0 for none\nEnter Your Department : ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) { return "sales"; }
		else if (depChoice == 2) { return "dev"; }
		else if (depChoice == 3) { return "accounting"; }
		else { return ""; }
	}	
	
	// Generate random password
	private String setRandomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()";
		char[] password = new char[length];
		for (int i=0; i<password.length; i++) {
			int randNum = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(randNum);
		}
		return new String(password);
	}
	
	// See mailbox capacity
	
	// See alternate email
	
	// Change password

}
