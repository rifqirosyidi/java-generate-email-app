package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String department;
	private int mailboxCapacity = 500;
	private String altEmail;
	private String companyName = "company.com";
	
	// Constructor to receive first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	
		// Ask the department name from department Method
		this.department = setDepartment();
		
		// Call method to return Random Password
		this.password = setRandomPassword(8);
		
		// Generate Email
		if(this.department == "sales" || this.department == "dev" || this.department == "account") {
			email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + this.department + "." + companyName;
		} else {
			email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + companyName;
		}
		
	}
	
	// Ask for the department
	private String setDepartment() {
		System.out.println("DEPARTMENT CODE FOR " + firstName + " " + lastName + " :\n1 for sales\n2 for dev\n3 for Accounting\n0 for none\nEnter Your Department : ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) { return "sales"; }
		else if (depChoice == 2) { return "dev"; }
		else if (depChoice == 3) { return "account"; }
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
	public void setMailboxCap(int mailboxCapacity) {
		this.mailboxCapacity = mailboxCapacity;
	}
	
	// See alternate email
	public void setAlternateEmail(String altEmail) {
		this.altEmail = altEmail;
	}
	
	// Change password
	public void changePassword(String password) {
		this.password = password;
	}
	
	// Getter
	public int getMailboxCap() { return mailboxCapacity; }
	public String getAlternateEmail() { return altEmail; }
	public String getPassword() { return password; }
	
	public String showInfo() {
		return "DISPLAY NAME : " + firstName + lastName +
				"\nYOUR PASSWORD : " + password +
				"\nCOMPANY EMAIL : " + email +
				"\nMAILBOX CAP : " + mailboxCapacity;
	}
}
	
	