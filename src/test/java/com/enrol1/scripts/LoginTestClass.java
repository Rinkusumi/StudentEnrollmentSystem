package com.enrol1.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.enrol1.constants.AutomationConstants;
import com.enrol1.pages.LoginPage;
import com.enrol1.testbase.TestBase;
import com.enrol1.utilities.ExcelUtility;

public class LoginTestClass extends TestBase {
	
	
LoginPage objLogin;
	
	@Test(priority=1)
   
	
	public void verifyValidLogin() throws IOException, InterruptedException {
		 driver .navigate().refresh();	
			
		 //Create Login Page object 
    objLogin = new LoginPage();
   
    //login to application
    objLogin.clearInputTxt(); 
    objLogin.login();
    
    
    String username = ExcelUtility.getCellData(0, 0);
    String password = ExcelUtility.getCellData(0, 1);
    String dropdown =  ExcelUtility.getCellData(0, 2);
   
    objLogin.setUserName(username);
    objLogin.setPassword(password);
    objLogin.dropdown();
    objLogin.Signin();
  
		Thread.sleep(3000);
	
   
    driver.switchTo().alert().accept();
   
   
    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
    String actualTitle =driver.getTitle();
    Assert.assertEquals(expectedTitle,actualTitle);
    
    }
	
	
	
	
	
	
	
	//verify with invalid password
	@Test(priority=0)
	public void verifyInvalidLogin() throws IOException, InterruptedException {
		 driver .navigate().refresh();	
		
	    //Create Login Page object
		
	    objLogin = new LoginPage();
	   // login to application
	    objLogin.login();
	   
	    String username = ExcelUtility.getCellData(2, 0);
	    String password = ExcelUtility.getCellData(2, 1);
	    String dropdown =  ExcelUtility.getCellData(2, 2);
	  
	    
	    objLogin.setUserName(username);
	    objLogin.setPassword(password);
	    objLogin.dropdown();
	    objLogin.Signin();
	   
	    Thread.sleep(2000);
	   driver.switchTo().alert().accept();
	   String expectedTitle =AutomationConstants.INVALIDLOGIN;
	    String actualTitle =driver.getTitle();
	    Assert.assertEquals(expectedTitle,actualTitle);
	    
	   driver.navigate().refresh();	
		
	    }
	
}
