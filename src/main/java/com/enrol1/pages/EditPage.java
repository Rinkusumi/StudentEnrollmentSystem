package com.enrol1.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.enrol1.testbase.TestBase;

public class EditPage extends TestBase {
	@FindBy(xpath="//*[@id=\"courses\"]/div/div/div[1]/div[2]/div/div/a/span")
	WebElement AddCourse;
	
	@FindBy(xpath="//input[@id='cname']")
	WebElement CourseName;
	
	@FindBy(xpath="//input[@id='certification']")
	WebElement Certified;
	
	@FindBy(xpath="//input[@id='code']")
	WebElement CourseCode;
	
	@FindBy(xpath="//input[@id='details']")
	WebElement CourseDetails;
	
@FindBy(xpath="//input[@name='price']")
WebElement CoursePrice;

@FindBy(xpath="//input[@name='eligibility']")
WebElement CourseEligible;

@FindBy(xpath="//button[text()='Add Course']")
WebElement Update;

@FindBy(xpath="//button[text()='Reset']")
WebElement Reset;

JavascriptExecutor jse = (JavascriptExecutor)driver;
//webelement of that page

public EditPage()
{
	PageFactory.initElements(driver, this);
}	

	
/*public void ClickOnAddcourse() {
	AddCourse.click();
}*/


public void setName(String strName) {
	// TODO Auto-generated method stub
	//CourseName.click();
	CourseName.sendKeys( strName);     
}
public void setCertife(String strCertife) {
	// TODO Auto-generated method stub
	//Certified.click();
	Certified.sendKeys(strCertife);     
}
	        
public void setCourseCode(String strCode) {
	// TODO Auto-generated method stub
	//CourseCode.click();
	 CourseCode.sendKeys(strCode);     
}
public void setCoursedetails(String strDetails) {
	// TODO Auto-generated method stub
	//CourseDetails.click();
	CourseDetails.sendKeys(strDetails);     
}
public void setCoursePrice(String strPrice) {
	// TODO Auto-generated method stub
	//CoursePrice.click();
	CoursePrice.sendKeys(strPrice);     
}
public void setCourseEligible(String strElegible) {
	// TODO Auto-generated method stub
	//CourseEligible.click();
	CourseEligible.sendKeys(strElegible);     
}
public void clickOnUpdate() {
	Update.click();
	
}
public void clickOnReset() {
	Reset.click();
}

}
