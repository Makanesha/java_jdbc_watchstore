package com.shopping;

public class login {
	User u;
	public boolean usertype(User u)
	{
		if(u.getUsername().equals("Makanesha")&u.getPassword().equals("4124")) {
			System.out.println("Welcome Admin");
			return true;
		}
		else {
			System.out.println("Welcome User");
			return false;
		}
		
	}
	
}
