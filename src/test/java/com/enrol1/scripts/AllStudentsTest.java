package com.enrol1.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.enrol1.constants.AutomationConstants;
import com.enrol1.pages.AllStudentPage;
import com.enrol1.pages.EditPage;
import com.enrol1.pages.HomePage;
import com.enrol1.pages.LoginPage;
import com.enrol1.testbase.TestBase;
import com.enrol1.utilities.ExcelUtility;
public class AllStudentsTest extends TestBase {
	
    AllStudentPage  obj4;
	
	@Test(priority=1)
    public void verifyStudentPage() throws  Throwable   {
		
		obj4 = new AllStudentPage();
		       
				Thread.sleep(3000);
				obj4.clickOnAll();
		      // objEdit.ClickOnAddcourse();
		       Thread.sleep(3000);
		       String urlActul=driver.getCurrentUrl();
		       String expctdUrl="http://64.227.182.128/students";
		       Assert.assertEquals(expctdUrl, urlActul);
		
	         }

	
	/*@Test(priority=2)
	
	public void Student()throws Throwable {
		obj4= new AllStudentPage();
		Thread.sleep(2000);
		
		obj4.clickOnAll();
		Thread.sleep(2000);
	}*/
		
		
		
		
		
		
	}
	


