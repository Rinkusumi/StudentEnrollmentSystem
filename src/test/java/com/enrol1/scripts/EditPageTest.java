package com.enrol1.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.enrol1.pages.CoursePage;
import com.enrol1.pages.EditPage;
import com.enrol1.testbase.TestBase;
import com.enrol1.utilities.ExcelUtility;

public class EditPageTest extends TestBase {
	EditPage objEdit ;
	
	@Test(priority=1)
    public void verifyEdit() throws  Throwable   {
		
			objEdit =new EditPage();
		       
				Thread.sleep(3000);
			
		      // objEdit.ClickOnAddcourse();
		       Thread.sleep(3000);
		       String urlActul=driver.getCurrentUrl();
		       String expctdUrl="http://64.227.182.128/add-course";
		       Assert.assertEquals(expctdUrl, urlActul);
		
	         }
		@Test(priority=2)
	    public void verifyEditList() throws  Throwable   {
    objEdit = new EditPage();
    
   /* objEdit.ClickOnAddcourse();*/
    
    
    String CourseName = ExcelUtility.getCellData(3, 0);

		
	
    String Certified = ExcelUtility.getCellData(3, 1);
    String CourseCode =  ExcelUtility.getCellData(3, 2);
    String  CourseDetails = ExcelUtility.getCellData(3, 3);
    String CoursePrice = ExcelUtility.getCellData(3, 4);
    String CourseEligible =  ExcelUtility.getCellData(3, 5);
    Thread.sleep(2000);
   
    objEdit.setName(CourseName);
    objEdit.setCertife(Certified);
    Thread.sleep(2000);
    objEdit.setCourseCode(CourseCode);
    Thread.sleep(2000);
    objEdit.setCoursedetails(CourseDetails);
    Thread.sleep(2000);
    objEdit.setCoursePrice(CoursePrice);
    objEdit.setCourseEligible(CourseEligible);
    Thread.sleep(2000);
    objEdit.setCourseEligible(CourseEligible);
    Thread.sleep(2000);
    objEdit.clickOnUpdate();
    Thread.sleep(2000);
    
	       }
			@Test(priority=3)
		    public void verifyReset() throws  Throwable   {
	    objEdit = new EditPage();
	    
    objEdit.clickOnReset();
    Thread.sleep(2000);
  

}
}
