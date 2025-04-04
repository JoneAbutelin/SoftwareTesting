package org.datadriven;

import java.io.IOException;

import org.base.BaseClass;

public class WriteManyData extends BaseClass {
public static void main(String[] args) throws IOException {
	createNewExcelFile(0, 0, "Testng");
	createCell(0, 1, "Data Driven");
	createCell(0, 2, "Data");
	createCell(0, 3, "Jiju");
	createCell(0, 4, "DJJj");
	
	createRow(1, 0, "Selenium");
	createCell(1, 1, "Tmoo");
	createCell(1, 2, "Joo");

}
}
