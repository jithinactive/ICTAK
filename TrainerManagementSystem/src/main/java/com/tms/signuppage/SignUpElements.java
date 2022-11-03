package com.tms.signuppage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpElements {
	WebDriver driver;
	//Using PageFactory
	//FindBy is an annotation used in Selenium
	@FindBy(css="li.nav-item:nth-child(3) > a")
	private WebElement navbar;
	@FindBy(id="name")
	private WebElement name;
	@FindBy(id="email")
	private WebElement email;
	@FindBy(id="phone")
	private WebElement mobilenumber;
	@FindBy(id="address")
	private WebElement Address;
	@FindBy(id="h_qualification")
	private WebElement Qualification;
	@FindBy(id="skillSet")
	private WebElement SkillSet;
	@FindBy(id="company_name")
	private WebElement currentCompany;
	@FindBy(id="designation")
	private WebElement Designation;
	@FindBy(id="img")
	private WebElement Image;
	@FindBy(xpath="/html/body/app-root/app-sign-up/form/div[5]/div[2]/ng-multiselect-dropdown/div/div[1]/span")
	private WebElement dropdown;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="re_password")
	private WebElement passwordRetype;
	@FindBy(css="body > app-root > app-sign-up > form > button")
	private WebElement SignupBtn;

}
