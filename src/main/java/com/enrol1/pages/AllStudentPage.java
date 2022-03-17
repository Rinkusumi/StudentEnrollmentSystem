package com.enrol1.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.enrol1.testbase.TestBase;

public class AllStudentPage extends TestBase {
	
    
	@FindBy(xpath="//a[@routerlink='students']")
	WebElement Students;
	@FindBy(xpath="/html/body/app-root/app-students/div/ul[3]/li/div/div[2]/button[2]")
	WebElement ShowDetails;

	public  AllStudentPage()
	{
		PageFactory.initElements(driver, this);
	}	
	
	
	
	public void clickOnAll() {
		Students.click();
	}
	public void clickOnShowdetails() {
		ShowDetails.click();
	}

}
