package com.tms.scripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.tms.adminpages.AdminElements;
import com.tms.adminutil.ExcelUtil;

public class AdminTest extends TestBase {
	//creating an object of AdminElements class
	AdminElements obj;
	
	@Test(priority = 2,enabled = true)
	public void invalidMail() throws IOException
	{
		obj=new AdminElements(driver);
		obj.linkLoginClick();
		//driver.navigate().refresh();
		//creating variables
		String id=ExcelUtil.getCellData(2, 0);
		String pass=ExcelUtil.getCellData(2, 1);
		//executing
		
		
		obj.loginId(id);
		obj.passwd(pass);
		obj.SignInButton();
	}
	
	@Test(priority = 3,enabled = true)
	public void invalidPass() throws IOException
	{
		obj=new AdminElements(driver);
		driver.navigate().refresh();
		String id=ExcelUtil.getCellData(3, 0);
		String pass=ExcelUtil.getCellData(3, 1);
		obj.loginId(id);
		obj.passwd(pass);
		obj.SignInButton();
	}
	
	@Test(priority = 4,enabled = true)
	public void invalidMailPass() throws IOException
	{
		obj=new AdminElements(driver);
		driver.navigate().refresh();
		String id=ExcelUtil.getCellData(4, 0);
		String pass=ExcelUtil.getCellData(4, 1);
		obj.loginId(id);
		obj.passwd(pass);
		obj.SignInButton();
	}
	
	@Test(priority = 5, enabled = true)
	public void successLog() throws IOException
	{
		obj=new AdminElements(driver);
		
		driver.navigate().refresh();
		String id=ExcelUtil.getCellData(5, 0);
		String pass=ExcelUtil.getCellData(5, 1);
		obj.linkLoginClick();
		obj.loginId(id);
		obj.passwd(pass);
		obj.SignInButton();
	}
	@Test(priority = 6,enabled = true)
	public void aprRejBuuttons() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		obj.empTypeDrop("Internal");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		obj.AprBtn();
		
	}
	@Test(priority = 7,enabled = true)
	public void allocation()
	{
		
		obj.Alloc();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		obj.AllocLink("sansastark@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		obj.AllocBtn();
		obj.idPrint();
	}
	@Test(priority= 8,enabled = true)
	public void fill()
	{
		obj.allocDropCrs("RPA");
		obj.allocDropCrs("FSD");
		obj.allocDropCrs("CSA");
		obj.allocDropCrs("DSA");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		obj.allocDropBatch("DSA001");
		obj.timeSet();
		obj.startDate();
		obj.startDate();
		obj.endDate();
		obj.endDate();
		obj.MeetLink();
		//obj.FinalAllocBtn();
	}
	@Test(priority = 9,enabled = true)
	public void allocView() throws InterruptedException
	{
		obj.ViewAlloc();
		Thread.sleep(25000);
		
	}
	@Test(priority = 10, enabled= true)
	public void logout()
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		obj.logOut();
	}

}
