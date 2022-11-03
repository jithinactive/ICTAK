package com.tms.scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.tms.trainerpages.TrainerElements;
import com.tms.trainerutilities.ExcelUtility;

public class TestClass extends TestBase {
	
	//creating an object of TrainerElements class
	TrainerElements objElmt;
	
	@Test(priority = 1)
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
		
	}
	
	@Test(priority = 2)
	public void invalidEmail() throws IOException {
		
		objElmt = new TrainerElements(driver);
		String Email = ExcelUtility.getCellData(1, 0);
		String Pass = ExcelUtility.getCellData(1, 1);
		
		objElmt.LoginClick();
		objElmt.emailInput(Email);
		objElmt.passwd(Pass);
		objElmt.SignInButton();
		
	}
	
	@Test(priority = 3)
	public void invalidPass() throws IOException {
		
		objElmt = new TrainerElements(driver);
		String Email = ExcelUtility.getCellData(2, 0);
		String Pass = ExcelUtility.getCellData(2, 1);
		
		objElmt.LoginClick();
		objElmt.emailInput(Email);
		objElmt.passwd(Pass);
		objElmt.SignInButton();
		
	}
	
}
