package com.zensar.models;
//model
public class LoginBean 
{
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//business logic method
	public  boolean validateUser()
	{
		if(username!=null && password!=null && username.equals("veena") && password.equals("hello"))
		{

			return true;
		}
		else 
		{
			
			return false;
		}
	}

}
