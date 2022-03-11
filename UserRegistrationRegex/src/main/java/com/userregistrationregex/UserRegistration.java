package com.userregistrationregex;

/**
 * PRODEDURE
 * User Registration 
 * User Registration System needs to ensure all validations are in place during the User Entry
 * 1. User needs to enter a valid First Name
 * 2. User need to enter a valid Last Name
 * 3. User need to enter a valid Email address
 * 4. User need to enter a valid Mobile Number with country code and 10 digit number 
 * 5. User need to enter a valid Password with at least 8 characters and 1 Upper case
 *
 */
public class UserRegistration 
{
    public static void main( String[] args )
    {
    	/*
    	 * Creating object of userDetails class
    	 */
    	UserDetails user = new UserDetails();
    	
    	/**
    	 * calling firstName method to ensure valid first name
    	 */
    	user.firstName();
    	
    	/**
    	 * calling lastName method to ensure valid last name
    	 */
    	user.lastName();
    	
    	/**
    	 * Calling email method to ensure valid email 
    	 */
    	user.email();
    	
    	/**
    	 * Calling mobileNumber method to ensure valid Mobile Number
    	 */
    	user.moblieNumber();
    	
    	/**
    	 * Calling password method to ensure valid password
    	 */
    	user.password();
    }
}
