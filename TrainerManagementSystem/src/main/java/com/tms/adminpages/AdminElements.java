package com.tms.adminpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminElements {
	WebDriver driver;
//	By loginlink=By.xpath("//*[@id=\"navbarNav\"]/ul/li[2]/a");
//	By logid=By.name("email");
//	By logpass=By.name("password");
//	By signin=By.xpath("/html/body/app-root/app-login/main/form/button");
//	
//	public AdminElements(WebDriver driver)
//	{
//		this.driver=driver;
//	}
//	public void login(String logidval,String logpassval)
//	{
//		driver.findElement(loginlink).click();
//		driver.findElement(logid).sendKeys("logidval");
//		driver.findElement(logpass).sendKeys("logpassval");
//		driver.findElement(signin).click();
//	}
	public AdminElements(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"navbarNav\"]/ul/li[2]/a")
	public WebElement linkLogin;
	public void linkLoginClick()
	{
		linkLogin.click();
	}
	
	@FindBy(name = "email")
	public WebElement email;
	public void emailInput(String mailID)
	{
		email.sendKeys(mailID);
	}

	@FindBy(name = "password")
	public WebElement password;
	public void passwd(String pwd)
	{
		password.sendKeys(pwd);
	}

	@FindBy(xpath = "\"/html/body/app-root/app-login/main/form/button\"")
	public WebElement signIn;
	public void SignInButton()
	{
		signIn.click();
	}
	
	@FindBy(xpath = "/html/body/app-root/app-admindash/div/div/table/tbody/tr[1]/td[8]/select")
	public Select empType;
	public void empTypeDrop()
	{
		empType.selectByVisibleText("Internal");
	}
	
	@FindBy(xpath = "/html/body/app-root/app-admindash/div/div/table/tbody/tr[1]/td[9]/a[1]")
	public WebElement approveBtn;
	public void ApproveButton()
	{
		approveBtn.click();
	}
	
	@FindBy(xpath = "/html/body/app-root/app-admindash/div/div/table/tbody/tr[1]/td[9]/a[2]")
	public WebElement rejectBtn;
	public void RejectButton()
	{
		rejectBtn.click();
	}
	
	@FindBy(xpath = "//*[@id=\"navbarNav\"]/ul/li[2]/a")
	public WebElement allocLink;
	public void Alloc()
	{
		allocLink.click();
	}
	
	@FindBy(xpath = "/html/body/app-root/app-search-trainer/div/div[2]/table/tbody/tr[1]/td[10]/a")
	public WebElement allocBtn;
	public void AllocBtn()
	{
		allocBtn.click();
	}
	@FindBy(xpath = "//*[@id=\"courseid\"]")
	public Select allocCrsID;
	public void AllocCrsID()
	{
		allocCrsID.selectByVisibleText("FSD");
	}
	@FindBy(xpath = "//*[@id=\"batchid\"]")
	public Select allocBatchID;
	public void AllocBatchID()
	{
		allocBatchID.selectByVisibleText("FSD001");
	}
	
	@FindBy(xpath = "//*[@id=\"venue\"]")
	public WebElement meetLink;
	public void MeetLink()
	{
		meetLink.sendKeys("ajp-agr-jun");
	}
	@FindBy(xpath = "/html/body/app-root/app-allocation/form/button")
	public WebElement finalAllocBtn;
	public void FinalAllocBtn()
	{
		finalAllocBtn.click();
	}
	
	@FindBy(xpath = "//*[@id=\"navbarNav\"]/ul/li[3]/a")
	public WebElement viewAllocLink;
	public void ViewAlloc()
	{
		viewAllocLink.click();
	}
}
