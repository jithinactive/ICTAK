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
		trainerAlloc.sendKeys(Keys.RETURN);
	}
	
	//clicking logout
	@FindBy(css = "li.nav-item:nth-child(3) > a")
	public WebElement logoutbtn;
	public void logoutClick() {
		logoutbtn.click();
	}
	
	//finding startdate in trainer allocation
	@FindBy(xpath = "/html/body/app-root/app-allocation-details-page/div/div/div/div/div/div[2]/table/tr[1]/td[2]")
	public WebElement startdate;
	public String StartDateCheck() {
		String stdate;
		stdate = startdate.getText();
		return stdate;
	}
	
	//finding stopdate in trainer allocation
	@FindBy(xpath = "/html/body/app-root/app-allocation-details-page/div/div/div/div/div/div[2]/table/tr[2]/td[2]")
	public WebElement stopdate;
	public String StopDateCheck() {
		String stpdate;
		stpdate = stopdate.getText();
		return stpdate;
	}
	
	//finding time in trainer allocation
	@FindBy(xpath = "/html/body/app-root/app-allocation-details-page/div/div/div/div/div/div[2]/table/tr[3]/td[2]")
	public WebElement time;
	public String TimeCheck() {
		String realTime;
		realTime = time.getText();
		return realTime;
	}
	
	//finding course id in trainer allocation
	@FindBy(xpath = "/html/body/app-root/app-allocation-details-page/div/div/div/div/div/div[2]/table/tr[5]/td[2]")
	public WebElement courseid;
	public String CourseidCheck() {
		String realid;
		realid = courseid.getText();
		return realid;
	}
	
	//finding batch id in trainer allocation
	@FindBy(xpath ="/html/body/app-root/app-allocation-details-page/div/div/div/div/div/div[2]/table/tr[6]/td[2]")
	public WebElement batchid;
	public String Batchidcheck() {
		String realbatch;
		realbatch = batchid.getText();
		return realbatch;
	}
	
	
	
	/*
	@FindBy(xpath="/html/body/app-root/app-sign-up/form/div[5]/div[2]/ng-multiselect-dropdown/div/div[1]/span")
	 
	private WebElement dropdown;
	public void menu()
	{
		dropdown.click();
	}
	
	@FindBy(css="li.multiselect-item-checkbox:nth-child(1) > div")
	private WebElement selection;
	public void course() {
		selection.click();
	}
	*/
	
	
}
