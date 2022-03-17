package com.enrol1.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.enrol1.testbase.TestBase;
public class HomePage extends TestBase

{
	//WebDriver driver;
	
	//locating know more button
	
	@FindBy(xpath="//a[@routerlink='home']")
	WebElement homeLink;
	
	@FindBy(xpath="//button[contains(text(),'Show More')]")
	WebElement showMore;
	
	/*@FindBy(xpath="//a[@href='/courses']")
	WebElement courseLink;
	
	@FindBy(xpath="//div[@class='team-hover']")
	WebElement imageLogo;
	*/
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}		
	//public HomePage(WebDriver driver){
       // this.driver = driver;
        //This initElements method will create all WebElements
       // PageFactory.initElements(driver, this);
   // }
	
	public void clickHomeLink()
	{
	System.out.println("Before");
	homeLink.click();	
	System.out.println("After");
	
	}
	public void clickShowMore() {
		showMore.click();
		System.out.println("After22");
	}
	
	
	
	/*public CoursePage clickShowMore() throws Throwable{
	
	System.out.println("Before1");
	showMore.click();	
	System.out.println("After1");
	return new 	CoursePage();
	}*/
	
	
	
	
}