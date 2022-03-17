package com.enrol1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.enrol1.testbase.TestBase;

public class LoginPage extends TestBase {


	
		/* All WebElements are identified by @FindBy annotation
		*/
	//	WebDriver driver;
		@FindBy(xpath="//a[@routerlink='/login/studentlogin']")
		private WebElement login;
		
		@FindBy(xpath="//input[@name='email']")
	    private WebElement username;
	    @FindBy(xpath="//input[@name='password']")
	    private WebElement password;
	    @FindBy(xpath="//select[@name='role']")
	    private WebElement dropdown;
	    @FindBy(xpath="//input[@name='sign-in']")
	    private WebElement Signin;
	    @FindBy(xpath="//a[@routerlink='home']]")
		WebElement homeLink;
		
	    @FindBy(xpath="//button[contains(text(),'Show More')]")
		WebElement showmore;
	    @FindBy(xpath=  "//a[@class='smoothScroll']")
	    WebElement studentMenu;
		
	    public LoginPage()
		{
			PageFactory.initElements(driver, this);
		}	
	   
	   
		//public LoginPage(WebDriver driver){
	    //    this.driver = driver;
	        //This initElements method will create all WebElements
	     //   PageFactory.initElements(driver, this);
	    //}
	    
       public void login() throws InterruptedException  {
    	   Actions builder = new Actions(driver);
    	   Thread.sleep(3000);
    	   builder.moveToElement(login).click().perform();
    	   
}

		public void setUserName(String strUserName) {
			// TODO Auto-generated method stub
			username.sendKeys( strUserName);     
	    }

		//Set password in password textbox
	    
		public void setPassword(String strPassword) {
			// TODO Auto-generated method stub
			password.sendKeys(strPassword);
			
		}
		
		public void dropdown() {
			
			//dropdown1 created as instance variable and pass the element value(dropdown) to the dropdown1		
			Select dropdown1 = new Select(dropdown);
			dropdown1.selectByValue("admin");
					}

		
		
		
		
		public void Signin() {
			
			// TODO Auto-generated method stub
			
					Signin.click();
				
			
				
		}
		
		
		
		public void clearInputTxt() {
			// TODO Auto-generated method stub
			username.clear();
			password.clear();
			
		}
	/*	public void clickhome() {
			Actions action = new Actions(driver);
			action.moveToElement(homeLink).build().perform();
			showmore.click();
					
		}
		public void clickAllStudents() {
			studentMenu.click();
					
		}*/
}
			
		
		
		
			
		
		
		
		
	


