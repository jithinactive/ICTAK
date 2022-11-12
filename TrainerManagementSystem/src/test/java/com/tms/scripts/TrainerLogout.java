package com.tms.scripts;

import org.testng.annotations.Test;

import com.tms.trainerpages.TrainerElements;

public class TrainerLogout extends TrainerAllocation{

	TrainerElements objElmt;
	
	@Test(priority = 9, enabled = true)
	public void logginOut() {
		
		objElmt = new TrainerElements(driver);
		
		objElmt.logoutClick();
	}
}
