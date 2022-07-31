package com.bridgelab.userregistraction;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistractionUC5 {
	
	public static  void userValidation() {
		
		 Scanner scanner = new Scanner(System.in);
		boolean check = true;
	  
		while (check) {
		  System.out.println("Enter Your option to validate\n  1.First Name\n  2.Last Name\n  3.Email\n  4.Mobile No\n  5.Password\n ");
		  int option = scanner.nextInt();
		  scanner.nextLine();
		
		  switch (option) {
		
		  case 1:
			final String FIRSTNAME = "^([A-Z]{1}[a-zA-Z]{3,})";
			System.out.println("Enter First name :");
			String firstName = scanner.next();
		    boolean  resultForFirstName = Pattern.matches(FIRSTNAME, firstName);
		    System.out.println(resultForFirstName);
		    if(resultForFirstName == false) {
		    	System.out.println("Enter valid First Name");
			break;
		    }
		
		  case 2:
				final String LASTNAME = "^([A-Z]{1}[a-zA-Z]{3,})";
				System.out.println("Enter Last name :");
				String lastName = scanner.next();
			    boolean  resultForLastName = Pattern.matches(LASTNAME, lastName);
			    System.out.println(resultForLastName);
			    if(resultForLastName == false) {
			    	System.out.println("Enter valid Last Name");
				break;
			    }
		
		  case 3:	    
			    final String EMAIL = ("([a-z]{3}(.+)[a-z]{3}@[bl](.+)[co](.+)");
				System.out.println("Enter email :");
				String mail = scanner.nextLine();
			    boolean  resultEmail = Pattern.matches(EMAIL, mail);
				System.out.println(resultEmail);
			     if(resultEmail == false) {
				    System.out.println("Enter valid Email in abc.xyz@bl.com.in pattern");
				    break;
			     }
				
		  case 4:
		 
				final String MOBILE_NUMBER = "^(\\d{2})( )([7-9]{1})(\\d{9})";
				System.out.println("Enter Mobile Number");
				String mobileNumber = scanner.nextLine();
				boolean  resultMobileNumber = Pattern.matches(MOBILE_NUMBER, mobileNumber);
				System.out.println( resultMobileNumber);
				if(resultMobileNumber == false) {
					   System.out.println("Enter valid Mobile number 91 9113608868  pattern");
				break; 
				}
		
		  case 5:		
				final String PASSWORD = "^([a-zA-Z0-9]{8,})";
				System.out.println("Enter Password");
				String passWord = scanner.nextLine();
				boolean  resultPassword = Pattern.matches(PASSWORD, passWord);
				System.out.println( resultPassword);
				if(resultPassword == false) {
					   System.out.println("Enter valid password atleast 8 charactor");
				break; 
				}
		
		  default:
			 check = false;
				break;
		}
	}
}
	public static void main(String[] args) {
		userValidation();
	}

}
