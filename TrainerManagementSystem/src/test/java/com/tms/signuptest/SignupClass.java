package com.tms.signuptest;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.tms.SignupUtilities.ExcelUtilitiesSignup;
import com.tms.base.TestBase;
import com.tms.signuppage.SignUpElements;

public class SignupClass extends TestBase {
	SignUpElements objSign;
	
	@Test
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
		String designationVal=ExcelUtilitiesSignup.getCellData(2, 7);
		objSign.setDesignation(designationVal);
		
		//Photo upload
		File strimage = new File(System.getProperty("user.dir")+"/src/main/resources/"+"ProfImage.jpg");
		String imgLoad = strimage.getAbsolutePath();
		objSign.profPic(imgLoad);
		
		//dropdown
		objSign.menu();
		objSign.course();
		
		String paswrdVal=ExcelUtilitiesSignup.getCellData(2, 8);
		objSign.setPassword(paswrdVal);
		String repassVal=ExcelUtilitiesSignup.getCellData(2, 9);
		objSign.setRePassword(repassVal);
		objSign.clickSignup();
		}
	

}
