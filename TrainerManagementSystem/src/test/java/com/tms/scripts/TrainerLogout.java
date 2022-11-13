package com.tms.scripts;

import org.testng.annotations.Test;

import com.tms.trainerpages.TrainerElements;

public class TrainerLogout extends TestBase{

	TrainerElements objElmt;
	
	@Test(priority = 18, enabled = true)
	public void logginOut() {
		
		objElmt = new TrainerElements(driver);
		
		objElmt.logoutClick();
	}
}
