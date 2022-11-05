package com.tms.trainerpages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
	
	//login button clicking
	@FindBy(css = "li.nav-item:nth-child(2) > a")
	public WebElement login;
	public void LoginClick() {
		login.click();
	}
	
	//entering email field	
	@FindBy(css = "#floatingInput")
	public WebElement email;
	public void emailInput(String mailId) {
		email.sendKeys(mailId);
	}
	
	//entering password field
	@FindBy(css = "#floatingPassword")
	public WebElement password;
	public void passwd(String pwd) {
		password.sendKeys(pwd);
	}
	
	//clicking sign in button
	@FindBy(css = ".w-100")
	public WebElement signIn;
	public void SignInButton() {
		signIn.click();
	}
	
	
	
	//checking profile page info
	@FindBy(css = "div.col:nth-child(2) > div:nth-child(1) > div:nth-child(1) > h3")
	public WebElement infocheck;
	public String ProfileCheck(){
		String profileInfo;
		profileInfo = infocheck.getText();	
		return profileInfo;
	}
	
	//clicking edit button
	@FindBy(css = "div.card-body:nth-child(1) > button")
	public WebElement editButton;
	public void editbtnclick() {
		editButton.click();
	}
	
	//Edit Profile
	//entering name field in edit profile
	@FindBy(css = "#name")
	public WebElement editName;
	public void NameInput(String nameIn) {
		editName.clear();
		editName.sendKeys(nameIn);
	}
	
	//entering email field
	@FindBy(name = "email")
	public WebElement editEmail;
	public void editEmailInput(String emailIn) {
		editEmail.clear();
		editEmail.sendKeys(emailIn);
	}
	
	//entering mobile field
	@FindBy(css = "#phone")
	public WebElement editPhone;
	public void editPhoneInput(String phoneIn) {
		editPhone.clear();
		editPhone.sendKeys(phoneIn);
	}
	
	//entering address field
	@FindBy(css = "#address")
	public WebElement editAddress;
	public void editAddr(String addrIn) {
		editAddress.clear();
		editAddress.sendKeys(addrIn);
	}
	
	//entering highest qualification
	@FindBy(css = "#h_qualification")
	public WebElement editHQ;
	public void HQInput(String hqIn) {
		editHQ.clear();
		editHQ.sendKeys(hqIn);
	}
	
	//entering skill set
	@FindBy(css = "div.row:nth-child(5) > div:nth-child(2) > input")
	public WebElement editSkill;
	public void SkillInput(String skillIn) {
		editSkill.clear();
		editSkill.sendKeys(skillIn);
	}
	
	//entering company name
	@FindBy(css = "#company_name")
	public WebElement editCompany;
	public void companyInput(String companyIn) {
		editCompany.clear();
		editCompany.sendKeys(companyIn);
	}
	
	//entering designation
	@FindBy(css = "#designation")
	public WebElement editDesignation;
	public void designationInput(String designationIn) {
		editDesignation.clear();
		editDesignation.sendKeys(designationIn);
	}
	
	//uploading profile photo
	@FindBy(css = "#img")
	public WebElement editPhoto;
	public void photoInput(String ProfileImage) {
		editPhoto.clear();
		editPhoto.sendKeys(ProfileImage);
		
	}
	
	
	//clicking edit button
	@FindBy(css = ".btn")
	public WebElement saveEdit;
	public void saveButton() {
		saveEdit.sendKeys(Keys.RETURN);
	}
	
	//checking trainer allocation details
	@FindBy(css = "li.nav-item:nth-child(2) > a")
	public WebElement trainerAlloc;
	public void myAlloc() {
		trainerAlloc.click();
	}
	
	//clicking logout
	@FindBy(css = "li.nav-item:nth-child(3) > a")
	public WebElement logoutbtn;
	public void logoutClick() {
		logoutbtn.click();
	}
	
}
