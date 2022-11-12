package com.tms.scripts;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.internal.Utils;

import com.tms.trainerpages.TrainerElements;
import com.tms.trainerutilities.ExcelUtility;

public class TrainerProfile extends TrainerLogin {
	

	//creating an object of TrainerElements class
		TrainerElements objElmt;
		//TrainerLoginClass login;
	
	//Checking Profile Info
	@Test(priority = 15, enabled = true)
	public void TrainerProfileInfo() throws IOException {
		
		objElmt = new TrainerElements(driver);
		String info = objElmt.ProfileCheck();
		System.out.println(info);
		
	}
	
	/*
	//clicking edit profile buttton
	@Test(priority = 6, enabled = true)
	public void editClick() {
		objElmt = new TrainerElements(driver);
		
	}
	*/
	
	//entering all details
	@Test(priority = 16, enabled = true)
	public void putDetails() throws IOException, InterruptedException {
		
		objElmt = new TrainerElements(driver);
		
		objElmt.editbtnclick();
		Thread.sleep(5000);
		String Namein = ExcelUtility.getCellData(9, 0);
		objElmt.NameInput(Namein);
		String putEmailin = ExcelUtility.getCellData(9, 1);
		objElmt.editEmailInput(putEmailin);
		String putPhone = ExcelUtility.getCellData(9, 2);
		objElmt.editPhoneInput(putPhone);
		String putAddr = ExcelUtility.getCellData(9, 3);
		objElmt.editAddr(putAddr);
		String putQual = ExcelUtility.getCellData(9, 4);
		objElmt.HQInput(putQual);
		String putSkill = ExcelUtility.getCellData(9, 5);
		objElmt.SkillInput(putSkill);
		String putcompany = ExcelUtility.getCellData(9, 6);
		objElmt.companyInput(putcompany);
		String putDesig = ExcelUtility.getCellData(9, 7);
		objElmt.designationInput(putDesig);
		
		//uploading photo
		File ProfileImage = new File(System.getProperty("user.dir") +"/src/main/resources/" + "profile2.jpg");
		Utils.log("file exists: " + ProfileImage.exists());
		String ProfileimagePath = ProfileImage.getAbsolutePath();
		objElmt.photoInput(ProfileimagePath);
		
		//clicking edit button
		objElmt.saveButton();
		Thread.sleep(5000);
	
		
	}
	
	
	/*entering email field
	@Test(priority = 8, enabled = true)
	public void putEmail() throws IOException {
		
		objElmt = new TrainerElements(driver);
		
	}
	
	//entering mobile field
	@Test(priority = 9, enabled = true)
	public void putMobile() throws IOException {
		
		objElmt = new TrainerElements(driver);
		
		
	}
	
	
	//entering address field
	@Test(priority = 10, enabled = true)
	public void putAddress() throws IOException {
		
		objElmt = new TrainerElements(driver);
		
	}
	
	//entering Highest Qualification
	@Test(priority = 11, enabled = true)
	public void putQualiication() {
		
		objElmt = new TrainerElements(driver);
		
	}
	
	
	//entering skill set
	@Test
	*/
	
	
}	