package com.tms.scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tms.trainerconstants.AutomationConstants;
import com.tms.trainerpages.TrainerElements;
import com.tms.trainerutilities.ExcelUtility;

public class TrainerLogin extends TestBase {
	
	//creating an object of TrainerElements class
	TrainerElements objElmt;
	
	@Test(priority = 11,enabled = true)
	public void invalidEmailPass() throws IOException {
		
		objElmt = new TrainerElements(driver);
		//creating variables
		String Email = ExcelUtility.getCellData(2, 0);
		String Pass = ExcelUtility.getCellData(2, 1);
		//executing
		objElmt.LoginClick();
		objElmt.emailInput(Email);
		objElmt.passwd(Pass);
		objElmt.SignInButton();
		//Invalid Login Credential Alert
		WebElement InvalidAlert = driver.findElement(By.cssSelector(".alert"));
		String actAlert = InvalidAlert.getText();
		String expAlert = AutomationConstants.LOGINALERT;
		Assert.assertEquals(expAlert,actAlert);
		
	}
	
	@Test(priority = 12,enabled = true)
	public void invalidEmail() throws IOException {
		
		objElmt = new TrainerElements(driver);
		driver.navigate().refresh();
		String Email = ExcelUtility.getCellData(3, 0);
		String Pass = ExcelUtility.getCellData(3, 1);
		
//		objElmt.LoginClick();
		objElmt.emailInput(Email);
		objElmt.passwd(Pass);
		objElmt.SignInButton();
		//Invalid Login Credential Alert
		WebElement InvalidAlert = driver.findElement(By.cssSelector(".alert"));
		String actAlert = InvalidAlert.getText();
		String expAlert = AutomationConstants.LOGINALERT;
		Assert.assertEquals(expAlert,actAlert);
	}
	
	@Test(priority = 13,enabled = true)
	public void invalidPass() throws IOException {
		
		objElmt = new TrainerElements(driver);
		driver.navigate().refresh();
		String Email = ExcelUtility.getCellData(4, 0);
		String Pass = ExcelUtility.getCellData(4, 1);
		
//		objElmt.LoginClick();
		objElmt.emailInput(Email);
		objElmt.passwd(Pass);
		objElmt.SignInButton();
		//Invalid Login Credential Alert
		WebElement InvalidAlert = driver.findElement(By.cssSelector(".alert"));
		String actAlert = InvalidAlert.getText();
		String expAlert = AutomationConstants.LOGINALERT;
		Assert.assertEquals(expAlert,actAlert);
	}
	
	@Test(priority = 14,enabled = true)
	public void validLogin() throws IOException {
		
		objElmt = new TrainerElements(driver);
		driver.navigate().refresh();
		String Email = ExcelUtility.getCellData(5, 0);
		String Pass = ExcelUtility.getCellData(5, 1);
		
//		objElmt.LoginClick();
		objElmt.emailInput(Email);
		objElmt.passwd(Pass);
		objElmt.SignInButton();
		System.out.println("***Login Successful***");
		
	}
	
}
