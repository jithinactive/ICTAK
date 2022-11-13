package com.tms.adminpages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AdminElements {
	
	WebDriver driver;
	
	By empType=By.xpath("/html/body/app-root/app-admindash/div/div/table/tbody/tr[1]/td[8]/select");
	By approveBtn=By.xpath("/html/body/app-root/app-admindash/div/div/table/tbody/tr[1]/td[9]/a[1]");
	By rejectBtn=By.xpath("/html/body/app-root/app-admindash/div/div/table/tbody/tr[1]/td[9]/a[2]");
	By allocCrsID=By.xpath("/html/body/app-root/app-allocation/form/div[3]/div[2]/select");
	By allocBatchID=By.xpath("/html/body/app-root/app-allocation/form/div[4]/div[1]/select");
	By time=By.xpath("/html/body/app-root/app-allocation/form/div[4]/div[2]/input");
	By start=By.xpath("/html/body/app-root/app-allocation/form/div[5]/div[1]/input");
	By end=By.xpath("/html/body/app-root/app-allocation/form/div[5]/div[2]/input");
	
	public AdminElements(WebDriver driver) {
		this.driver = driver;
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
	public void loginId(String logid)
	{
		email.sendKeys(logid);
	}

	@FindBy(name = "password")
	public WebElement password;
	public void passwd(String logpwd)
	{
		password.sendKeys(logpwd);
	}

	@FindBy(xpath = "/html/body/app-root/app-login/main/form/button")
	public WebElement signIn;
	public void SignInButton()
	{
		signIn.click();
	}
	public void empTypeDrop(String empType2) 
	{
		List<WebElement> row=driver.findElements(By.xpath("/html/body/app-root/app-admindash/div/div/table/tbody/tr/td[9]"));
		System.out.println("Rows=========="+row.size());
		List<WebElement> col=driver.findElements(By.xpath("/html/body/app-root/app-admindash/div/div/table/tbody/tr[1]/td"));
		System.out.println("Cols=========="+col.size());
		//driver.findElement(rejectBtn).click();
		Select empType1= new Select(driver.findElement(By.xpath("/html/body/app-root/app-admindash/div/div/table/tbody/tr["+row.size()+"]/td[8]/select")));
		empType1.selectByVisibleText(empType2);
	}
	public void AprBtn()
	{
		List<WebElement> row=driver.findElements(By.xpath("/html/body/app-root/app-admindash/div/div/table/tbody/tr/td[9]"));
		System.out.println("Rows=========="+row.size());
		WebElement AprBtn=driver.findElement(By.cssSelector("body > app-root > app-admindash > div > div > table > tbody > tr:nth-child("+row.size()+") > td:nth-child(9) > a.btn.btn-success"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		System.out.println(AprBtn.getText());
//		Actions action=new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("/html/body/app-root/app-admindash/div/div/table/tbody/tr["+row.size()+"]/td[9]/a[2]"))).build().perform();
		AprBtn.click();
	}
	@FindBy(xpath = "//*[@id=\"navbarNav\"]/ul/li[2]/a")
	public WebElement allocLink;
	public void Alloc()
	{
		allocLink.click();
	}
	public void AllocLink(String srcmail)
	{
		WebElement search;
		search=driver.findElement(By.xpath("/html/body/app-root/app-search-trainer/div/div[1]/input"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		search.sendKeys(srcmail);	
	}
	public void AllocBtn()
	{
		WebElement allocBtn;
		allocBtn=driver.findElement(By.cssSelector("body > app-root > app-search-trainer > div > div.scoll > table > tbody > tr > td:nth-child(10) > a"));
		allocBtn.click();
	}
	public void idPrint()
	{
		WebElement id=driver.findElement(By.xpath("/html/body/app-root/app-allocation/form/div[1]/div[1]/input"));
		System.out.println(id.getText());
	}
	public void allocDropCrs(String Crs) 
	{
		Select allocCrsID1= new Select(driver.findElement(allocCrsID));
		List<WebElement> lst= allocCrsID1.getOptions();
		for(WebElement options:lst)
			System.out.println(options.getText());
		allocCrsID1.selectByVisibleText(Crs);
	}
	public void allocDropBatch(String Batch)
	{
		Select allocBatchID1=new Select(driver.findElement(allocBatchID));
		List<WebElement> lst= allocBatchID1.getOptions();
		for(WebElement options:lst)
			System.out.println(options.getText());
		allocBatchID1.selectByVisibleText(Batch);
	}
	public void timeSet()
	{
		driver.findElement(time).sendKeys("1010");
	}
	public void startDate()
	{
		driver.findElement(start).sendKeys("01042022");
	}
	public void endDate()
	{
		driver.findElement(end).sendKeys("02042022");
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
	@FindBy(xpath = "/html/body/app-root/app-viewallocation/div[1]/app-adminnav/nav/div/div/ul/li[4]/a")
	public WebElement logout;
	public void logOut()
	{
		logout.click();
	}
	

}
