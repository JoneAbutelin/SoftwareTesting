package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
public static void main(String[] args) throws IOException {
	File f = new File("J:\\Code\\Automationn\\MavenInstall\\Data\\Excel\\Book1.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	
	Sheet sheet = wb.getSheet("Details");
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		Row row = sheet.getRow(i);
		for (int j = 1; j < row.getPhysicalNumberOfCells(); j++) {
			Cell c = row.getCell(1);
		System.out.println("Print A Column: " + c); 
	
		}
	}
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//    for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
//		Row row = sheet.getRow(i);
//		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
//			Cell c = row.getCell(j);
//		//	System.out.println("Print all cells: " + cell);
//			int cellType = c.getCellType();
//			if(cellType==1) {
//				String val = c.getStringCellValue();
//				System.out.println("String value: " + val);
//			}
//			else if(DateUtil.isCellDateFormatted(c)) {
//			Date dd = c.getDateCellValue();
//			SimpleDateFormat s = new SimpleDateFormat("dd-MMM-yy");
//			String format = s.format(dd);
//			System.out.println("Date:" + format);
//			}
//			else {
//				double  d = c.getNumericCellValue();
//				long l = (long) d ;
//				String valueOf = String.valueOf(l);
//				System.out.println("Numeric :"+valueOf);
//			}
//		}
//	}
	
	
	
	
	
	
	
	
	
	
	
	
//	Row row = sheet.getRow(1);
//	Cell cell = row.getCell(0);
//	System.out.println("Print selenium: " + cell );
	
	

