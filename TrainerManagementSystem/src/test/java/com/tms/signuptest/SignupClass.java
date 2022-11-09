package com.tms.signuptest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		
       //objSign.coursemenu("Full Stack Development");
		/*driver.get("https://trainermanagement.herokuapp.com/signup");
		driver.findElement(By.cssSelector("div[class=multiselect-dropdown]"));
		WebElement course=driver.findElement(By.cssSelector("li.multiselect-item-checkbox:nth-child(1) > div:nth-child(2)"));
		course.click();*/
		
		WebElement selectMyElement = driver.findElement(By.cssSelector("div[class=multiselect-dropdown]")); 
		selectMyElement.click();
		WebElement course=driver.findElement(By.cssSelector("li.multiselect-item-checkbox:nth-child(1) > div"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50)); //here, wait time is 50 seconds

		wait.until(ExpectedConditions.visibilityOf(course)); //this will wait for elememt to be visible for 20 seconds
		course.click(); //now it clicks on element
		

		//Actions keyDown = new Actions(driver);
		//keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();
		
		String paswrdVal=ExcelUtilitiesSignup.getCellData(2, 8);
		objSign.setPassword(paswrdVal);
		String repassVal=ExcelUtilitiesSignup.getCellData(2, 9);
		objSign.setRePassword(repassVal);
		
		objSign.clickSignup();
		}
	

}
