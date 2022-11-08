package com.tms.scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.tms.trainerpages.TrainerElements;

public class TrainerAlloaction extends TrainerProfile {

	TrainerElements objElmt;
	
	@Test(priority = 8, enabled = true)
	public void allocCheck() throws IOException {
		
		objElmt = new TrainerElements(driver);
	
		objElmt.myAlloc();
		
		
	}
}
