package com.tms.scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tms.trainerconstants.AutomationConstants;
import com.tms.trainerpages.TrainerElements;
import com.tms.trainerutilities.ExcelUtility;

public class TrainerLoginClass extends TestBase {
	
	//creating an object of TrainerElements class
	TrainerElements objElmt;
	
	@Test(priority = 1,enabled = false)
	public void invalidEmailPass() throws IOException {
		
		objElmt = new TrainerElements(driver);
		//creating variables
		String Email = ExcelUtility.getCellData(0, 0);
		String Pass = ExcelUtility.getCellData(0, 1);
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
	
	@Test(priority = 2,enabled = false)
	public void invalidEmail() throws IOException {
		
		objElmt = new TrainerElements(driver);
		driver.navigate().refresh();
		String Email = ExcelUtility.getCellData(1, 0);
		String Pass = ExcelUtility.getCellData(1, 1);
		
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
	
	@Test(priority = 3,enabled = false)
	public void invalidPass() throws IOException {
		
		objElmt = new TrainerElements(driver);
		driver.navigate().refresh();
		String Email = ExcelUtility.getCellData(2, 0);
		String Pass = ExcelUtility.getCellData(2, 1);
		
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
	
	@Test(priority = 4)
	public void validLogin() throws IOException {
		
		objElmt = new TrainerElements(driver);
		driver.navigate().refresh();
		String Email = ExcelUtility.getCellData(3, 0);
		String Pass = ExcelUtility.getCellData(3, 1);
		
		objElmt.LoginClick();
		objElmt.emailInput(Email);
		objElmt.passwd(Pass);
		objElmt.SignInButton();
		System.out.println("***Login Successful***");
		String info = objElmt.ProfileCheck();
		System.out.println(info);
		
	}
	
}
