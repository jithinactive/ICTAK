package com.tms.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.tms.trainerpages.TrainerElements;

public class SignupTest extends TestBase{

	/*TrainerElements objSign;
	
	@Test(priority=1)
	public void dropclick() {
		
		objSign = new TrainerElements(driver);
	objSign.menu();
	objSign.course();
}*/

@Test(priority=1)
 public void Signup() {
  
  driver.get("https://trainermanagement.herokuapp.com/signup");
  driver.findElement(By.cssSelector("div[class=multiselect-dropdown]")).click()
;
  WebElement var1 = driver.findElement(By.cssSelector("li.multiselect-item-checkbox:nth-child(1) > div"));
  var1.click();
}
}