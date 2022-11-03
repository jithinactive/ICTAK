package com.tms.admintest;

import org.testng.annotations.Test;

import com.tms.adminpages.AdminElements;
import com.tms.base.TestBase;

public class AdminTest extends TestBase {
//@Test	
//public void logTest()
//{
//	AdminElements obj=new AdminElements(driver);
//	obj.login("admin@gmail.com", "1234");
//	
//	
//}
	AdminElements obj;
	@Test
	public void loginBut()
	{
		obj= new AdminElements(driver);
		obj.linkLoginClick();
	}

}