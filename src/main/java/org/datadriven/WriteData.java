package org.datadriven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.BaseClass;

public class WriteData extends BaseClass {
public static void main(String[] args) throws IOException{
//	File f = new File("J:\\Code\\Automationn\\MavenInstall\\Data\\Excel\\newFile1.xlsx");
    createNewExcelFile(3, 0, "Selenium"); 
    createCell(4, 0, "Java"); 
    createCell(5, 0, "Take screenshot"); 

    createCell(6, 0, "Data driven");
    createCell(7, 0, "Cucumber");
    createCell(8, 0, "JUnit");
    createCell(9, 0, "TestNG");

    System.out.println("Excel file written ");
	

}
}

































//Row createRow = newSheet.createRow(4);
//Cell createCell = createRow.createCell(0);
//createCell.setCellValue("Data Driven");
//FileOutputStream fos = new FileOutputStream(f);
//wb.write(fos);