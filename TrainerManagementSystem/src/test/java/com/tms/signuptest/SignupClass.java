package com.tms.signuptest;

import java.io.File;
import java.io.IOException;
//import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.tms.SignupUtilities.ExcelUtilitiesSignup;
import com.tms.scripts.TestBase;
import com.tms.signupconstants.Signupconstants;
import com.tms.signuppage.SignUpElements;

public class SignupClass extends TestBase {
SignUpElements objSign;
	
	@Test(priority=1, enabled = true)
	public void details() throws IOException {
		objSign=new SignUpElements(driver);
		
		objSign.navigation();
		
		String nameVal=ExcelUtilitiesSignup.getCellData(2, 0);
		objSign.setName(nameVal);
		String mailVal=ExcelUtilitiesSignup.getCellData(2, 1);
		objSign.setEmai1(mailVal);
		String numVal=ExcelUtilitiesSignup.getCellData(2, 2);
		objSign.setMobNum(numVal);
		String addVal=ExcelUtilitiesSignup.getCellData(2, 3);
		objSign.setAddress(addVal);
		String qualVal=ExcelUtilitiesSignup.getCellData(2, 4);
		objSign.setQualification(qualVal);
		String skillVal=ExcelUtilitiesSignup.getCellData(2, 5);
		objSign.setSkillset(skillVal);
		String companyVal=ExcelUtilitiesSignup.getCellData(2, 6);
		objSign.setCurrentCompany(companyVal);
		
		
		WebElement down1 = driver.findElement(By.cssSelector("#designation"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", down1);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String designationVal=ExcelUtilitiesSignup.getCellData(2, 7);
		objSign.setDesignation(designationVal);
		WebElement var = driver.findElement(By.xpath("/html/body/app-root/app-sign-up/form/div[5]/div[2]/ng-multiselect-dropdown/div/div[1]/span/span[1]"));
		var.click();
		WebElement var1 = driver.findElement(By.cssSelector("li.multiselect-item-checkbox:nth-child(1) > div"));
		var1.click();
		
		
		//Photo upload
		File strimage = new File(System.getProperty("user.dir")+"/src/main/resources/"+"sansa.jpg");
		String imgLoad = strimage.getAbsolutePath();
		objSign.profPic(imgLoad);
		
		
		
		String paswrdVal=ExcelUtilitiesSignup.getCellData(2, 8);
		objSign.setPassword(paswrdVal);
		String repassVal=ExcelUtilitiesSignup.getCellData(2, 9);
		objSign.setRePassword(repassVal);
		
		objSign.clickSignup();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
	    String expected_SignupMsg=Signupconstants.SIGNUPMSG;
	    String actual_SignUpMsg=driver.switchTo().alert().getText();
	    Assert.assertEquals(expected_SignupMsg, actual_SignUpMsg);
	    
	    Alert al = driver.switchTo().alert();
	    al.accept();
	    try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	

}
