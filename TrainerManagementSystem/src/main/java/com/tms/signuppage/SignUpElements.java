package com.tms.signuppage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	public WebElement Image;
	
	@FindBy(xpath="/html/body/app-root/app-sign-up/form/div[5]/div[2]/ng-multiselect-dropdown/div/div[1]/span")
	private WebElement dropdown;
	
	@FindBy(css="li.multiselect-item-checkbox:nth-child(1) > div")
	private WebElement selection;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="re_password")
	private WebElement passwordRetype;
	
	@FindBy(css="body > app-root > app-sign-up > form > button")
	private WebElement SignupBtn;
	

	public SignUpElements(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);//This will initiate Pagefactory elements.
	}
	public void navigation() {
		navbar.click();
	}
	
	
	public void setName(String strName)
	{
		name.sendKeys(strName);
	}
	public void setEmai1(String strEmail)
	{
		email.sendKeys(strEmail);
	}
	public void setMobNum(String strMobNum)
	{
		mobilenumber.sendKeys(strMobNum);
	}
	public void setAddress(String straddress)
	{
		Address.sendKeys(straddress);
	}
	public void setQualification(String strQualification)
	{
		Qualification.sendKeys(strQualification);
	}
	public void setSkillset(String strSkillset)
	{
		SkillSet.sendKeys(strSkillset);
	}
	public void setCurrentCompany(String strCurrentCompany)
	{
		currentCompany.sendKeys(strCurrentCompany);
	}
	public void setDesignation(String strDesignation)
	{
		Designation.sendKeys(strDesignation);
	}
	
	public void menu()
	{
		dropdown.click();
	}
	public void course() {
		selection.click();
	}
	public void profPic(String strimage) {
		Image.sendKeys(strimage);
	}
	
	public void setPassword(String strPassword)
	{
		password.sendKeys(strPassword);
	}
	public void setRePassword(String strRePassword)
	{
		passwordRetype.sendKeys(strRePassword);	
	}
	public void clickSignup()
	{
		SignupBtn.click();
	}
	

}
