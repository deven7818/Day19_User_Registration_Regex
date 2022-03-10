package com.userregistrationregex;

/**
 * PRODEDURE
 * User Registration 
 * User Registration System needs to ensure all validations are in place during the User Entry
 * 1. User needs to enter a valid First Name
 * 
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
    }
}
