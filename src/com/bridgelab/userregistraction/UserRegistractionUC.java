package com.bridgelab.userregistraction;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistractionUC {
	
	public static void main(String[] args) {
	    // get user input
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Please enter name:");
	    String firstName = scanner.nextLine();

	    
	    System.out.println("\nValidate Result:");

	    if (!validateFirstName(firstName))
	      System.out.println("Invalid Name");
	    
	    else
	      System.out.println("Valid Name");
	  }

	 
	  public static boolean validateFirstName(String firstName) {
	    return firstName.matches("[A-Z]{1}[a-z]{3}");
	  }
}
