package com.gl.main;
import java.util.Scanner;


import com.gl.employee.Employee;
import com.gl.services.CredentialServices;
public class Application {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String firstName=null;
		String lastName=null;
		String department=null;
		String email=null;
		String password=null;
		System.out.println("Enter first name");
		firstName=sc.nextLine();
		System.out.println("Enter last name");
		lastName=sc.nextLine();
		String company="Great learning";
		Employee emp=new Employee(firstName,lastName);
		System.out.println("Enter department name 1. techdepartment\n 2. HR department\n 3. Legal\n 4.");
		int option=sc.nextInt();
		do {
		switch(option) {
		        case 1: department="tech department";
		        break;
		        case 2: department="HR department";
		        break;
		        case 3: department="Legel department";
		        break;
		        case 4: department= "Admin";
		        break;
		        default:option=0;
		        	System.out.println("wrong choice");
			
		}
		
		}while(option==0);
	
	
	CredentialServices cs=new CredentialServices(department,emp);
	cs.generateEmailAddress(firstName,lastName);
	cs.generatePassword();
	cs.showCredentials();
	}
}
