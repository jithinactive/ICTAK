package com.tms.trainerutilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	private static XSSFWorkbook ExcelBook;
	private static XSSFSheet ExcelSheet;
	
	public static String getCellData(int RowNum, int ColNUm) throws IOException {
		FileInputStream ExcelFile = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/"+"TrainerExcel.xlsx");
		
		ExcelBook = new XSSFWorkbook(ExcelFile);
		ExcelSheet = ExcelBook.getSheetAt(0);
		DataFormatter formatter = new DataFormatter();
		return 
		formatter.formatCellValue(ExcelSheet.getRow(RowNum).getCell(ColNUm));
		
	}
}
