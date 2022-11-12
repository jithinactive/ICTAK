package com.tms.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tms.trainerpages.TrainerElements;
import com.tms.trainerutilities.ExcelUtility;

public class TrainerAllocation extends TrainerProfile {

	TrainerElements objElmt;
	
	@Test(priority = 17, enabled = true)
	public void allocCheck() throws IOException {
		
		objElmt = new TrainerElements(driver);
	
		objElmt.myAlloc();
		
		/*
		String actStDate = objElmt.StartDateCheck();
		String expStDate = ExcelUtil.getCellData(0, 0);
		Assert.assertEquals(expStDate, actStDate);
		
		
		String actStopDate = objElmt.StopDateCheck();
		String expStopDate = ExcelUtil.getCellData(0, 0);
		Assert.assertEquals(expStopDate, actStopDate);
		
		
		String actTime = objElmt.TimeCheck();
		String expTime = ExcelUtil.getCellData(0, 0);
		Assert.assertEquals(expTime, actTime);
		
		
		String actCourseID = objElmt.CourseidCheck();
		String expCourseID = ExcelUtil.getCellData(0, 0);
		Assert.assertEquals(expCourseID, actCourseID);
		
		
		String actBatchID = objElmt.Batchidcheck();
		String expBatchID = ExcelUtil.getCellData(0, 0);
		Assert.assertEquals(expBatchID, actBatchID);
		*/
		
	}
}
