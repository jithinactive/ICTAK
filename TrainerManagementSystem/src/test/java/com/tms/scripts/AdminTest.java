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
	
	AdminElements obj;
	
	@Test(priority = 1,enabled = false)
	public void invalidMail() throws IOException
	{
		obj=new AdminElements(driver);
		driver.navigate().refresh();
		String id=ExcelUtil.getCellData(2, 0);
		String pass=ExcelUtil.getCellData(2, 1);
		obj.linkLoginClick();
		obj.loginId(id);
		obj.passwd(pass);
		obj.SignInButton();
	}
	
	@Test(priority = 2, enabled = false)
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
	
	@Test(priority = 3, enabled = false)
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
	
	@Test(priority = 4, enabled = true)
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
	@Test(priority = 5,enabled = true)
	public void aprRejBuuttons() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		obj.empTypeDrop("Internal");
	}
	@Test(priority = 6)
	public void allocation()
	{
		
		obj.Alloc();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		obj.AllocBtn();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		obj.idPrint();
	}
	@Test(priority= 7)
	public void fill()
	{
		obj.allocDropCrs("RPA");
		obj.allocDropCrs("FSD");
		obj.allocDropCrs("CSA");
		obj.allocDropCrs("DSA");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		obj.allocDropBatch("DSA001");
		obj.timeSet();
		obj.startDate();
		obj.startDate();
		obj.endDate();
		obj.endDate();
		obj.MeetLink();
		obj.FinalAllocBtn();
	}
	@Test(priority = 8,enabled = true)
	public void allocView()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		obj.ViewAlloc();
		
	}
	@Test(priority = 9, enabled= false)
	public void logout()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		obj.logOut();
	}

}
