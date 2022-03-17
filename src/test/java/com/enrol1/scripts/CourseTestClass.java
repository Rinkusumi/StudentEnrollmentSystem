package com.enrol1.scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.enrol1.constants.AutomationConstants;
import com.enrol1.pages.CoursePage;
import com.enrol1.testbase.TestBase;


	public class CourseTestClass extends TestBase {
		
		
		
		CoursePage obj2;
		@Test(priority=1)
	      public void verifyEmployeesPage() throws Exception
	        {
			obj2 =new CoursePage();
		       Thread.sleep(3000);
		       obj2.clickOnCourse();
		       Thread.sleep(3000);
		       String urlActul=driver.getCurrentUrl();
		       String expctdUrl="http://64.227.182.128/courses";
		       Assert.assertEquals(expctdUrl, urlActul);
		
	         }
		 @Test(priority=2)
	      public void addCourseVerify() throws Exception
	         {
			 obj2 =new CoursePage();
	    	  
	           Thread.sleep(3000);
	           obj2.ClickOnAddCourse();
	              
	         }
			
		 @Test(priority=3)
	      public void knowMoreBtnVerify() throws Exception
	         {
			 obj2 =new CoursePage();
	    	  
	           Thread.sleep(3000);
	           try {
				obj2.clickOnKnowmore();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	              
	         }
			
		    
		   
		    
		    }
			
		   


