package com.tms.trainerpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrainerElements {

	WebDriver driver;
	
	public TrainerElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "div.col:nth-child(2) > div:nth-child(1) > div:nth-child(1) > h3")
	public WebElement infocheck;
	public void ProfileCheck(){
		String profileInfo;
		profileInfo = infocheck.getText();
	
			
		}
	}
	

