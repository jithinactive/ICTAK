package com.tms.trainerloginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
/* All WebElements are identified by @FindBy annotation
 */
WebDriver driver;

@FindBy(id="UserName")
private WebElement UserName;
@FindBy(id="password")
private WebElement password;    
@FindBy(id="signin-button")
private WebElement signin;

public Loginpage(WebDriver driver){
    this.driver = driver;
    //This initElements method will create all WebElements
    PageFactory.initElements(driver, this);
}

public void setUserName(String strUserName){
	username.sendKeys(strEmailaddress);     
}

public void setPassword(String strPassword){
    password.sendKeys(strPassword);
}

public void clickLogin()
{
	login.click();
}

