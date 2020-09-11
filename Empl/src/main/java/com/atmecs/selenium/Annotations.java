package com.atmecs.selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {

     @BeforeMethod
	public void accountLogin()
	{
       System.out.println("Account has been has been logged in");
}
     @AfterMethod
     public void accountLogout()
     {
    	 System.out.println("Account has been logged out");
     }
     @Test(priority=0)
     public void updateProfile() {
    	 System.out.println("profile has been updated");
     }
     
}
    