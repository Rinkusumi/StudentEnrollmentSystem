package com.enrol1.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.enrol1.pages.HomePage;
import com.enrol1.testbase.TestBase;

public class HomePageTestClass extends TestBase 

{
	
	HomePage obj1;
	@Test(priority=2)
	
	public void Home() throws Throwable
	{
		
	obj1= new HomePage();
	obj1.clickHomeLink();
	Thread.sleep(2000);
	obj1.clickShowMore();
	Thread.sleep(3000);
	
	
	}
	
}