package com.enrol1.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.enrol1.testbase.TestBase;

public class CoursePage extends TestBase

{

	
	@FindBy(xpath="//a[@href='/courses']")
	WebElement courseLink;
	
	

	
	
	
	@FindBy(xpath="//*[@id=\"courses\"]/div/div/div[1]/div[2]/div/div/a/span")
	WebElement AddCourse;
	
	@FindBy(xpath="//*[@id=\"courses\"]/div/div/div[3]/div[1]/div/div/button[1]/a")
	WebElement knowMore;
	

	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	//webelement of that page
	
	public CoursePage()
	{
		PageFactory.initElements(driver, this);
	}	
	
	

	
	public void clickOnCourse() {
		courseLink.click();
	}

	
	
	public void clickOnKnowmore() throws Throwable {
		Thread.sleep(2000);
		// TODO Auto-generated method stub
		jse.executeScript("arguments[0].click()", knowMore);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	
	


public void ClickOnAddCourse() {
	jse.executeScript("arguments[0].click()",  AddCourse);
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	




}
}
