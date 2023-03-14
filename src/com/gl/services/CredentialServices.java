package com.gl.services;
import com.gl.employee.Employee;
import java.util.*;
public class CredentialServices {
	Random random=new Random();
	String department;
	String company="Greatlearning";
	Employee emp;
	public CredentialServices(String department, Employee emp) {
		this.department=department;
		this.emp=emp;
	}
	public String generatePassword(){
		
		String password="";
		        String caps= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				int r=random.nextInt(25);
				String lower= "abcdefghijklmnopqrstuvwxyz";
				int r1=random.nextInt(25);
				String num= "0123456789";
				int r2=random.nextInt(9);
				String spcl="!@#$%^&*";
				int r3=random.nextInt(7);
				StringBuilder sb = new StringBuilder();
				sb.append(caps.charAt(r));
				sb.append(lower.charAt(r1));
				sb.append(num.charAt(r2));
				sb.append(spcl.charAt(r3));
				password = sb.toString();
				
				
				return password;
				
	
	}
	public String generateEmailAddress(String fName, String lName){
		String email=emp.getFirstName()+"."+ emp.getLastName()+"@"+company+".com";
		return email;
	
	}
	public void showCredentials(){
	
		System.out.println("your Email "+generateEmailAddress(emp.getFirstName(), emp.getLastName())+"   your Credentials:"+"Firstname is:"+emp.getFirstName()+"Last name is:"+emp.getLastName()+"password is "+generatePassword());
		
		
	}

}
