package com.tms.trainerloginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	 @FindBy(id="Home")
	    private WebElement Home;
	    @FindBy(id="login")
	    private WebElement login;    
	    @FindBy(id="Signup")
	    private WebElement signup;
	   
    WebDriver driver;
    
    public Homepage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
    
    public void setHome(String strHome){
    	Home.sendKeys("navbarNav");     
    }
    
    public void setLogin(String strLogin) {
    
	Login.sendkeys("nav-link");
    }
    
    public void setSignup(String strSignup){
    	Sigup.sendKeys("nav-link");
    }
    {
    else if 
    }
    
    public void setEnroll(String strEnroll){
    	Enroll.sendKeys("nav-link");
    }
    
    public void clickLogin()
    {
    	login.click();
    }
    
     
    
    
}
