package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
    private static WebDriverWait wait;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
     public static void closeBrowser() {
    	 driver.quit();
     }
     public static void launchBrowsers(String browser) {
         if (browser.equalsIgnoreCase("chrome")) {
             WebDriverManager.chromedriver().setup();
             driver = new ChromeDriver();
         } else if (browser.equalsIgnoreCase("firefox")) {
             WebDriverManager.firefoxdriver().setup();
             driver = new FirefoxDriver();
         } else if (browser.equalsIgnoreCase("edge")) { // IE is deprecated; use Edge instead
             WebDriverManager.edgedriver().setup();
             driver = new EdgeDriver();
         } else {
             throw new IllegalArgumentException("Invalid Browser: " + browser);
         }
         driver.manage().window().maximize();
     }
	public static void openUrl(String url) {
		driver.get(url);
	}

	 public static void pageTitle(String expectedTitle) {
	        String actualTitle = driver.getTitle();
	        System.out.println("Title: " + actualTitle);
	        Assert.assertEquals("Title does not match!", expectedTitle, actualTitle);
	    }
	public static void sendKeys(String text, WebElement element) {
	    element.sendKeys(text);
	}

	public static void clickBtn(WebElement element) {
       // wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
	public static String getText(WebElement element) {
		return element.getText();
	}

	public static void moveToElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	public static void scrollToElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public static void takeScreenshot(String fileName) {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("screenshots/" + fileName + ".png");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	public static void createNewExcelFile(int rowNum, int cellNum, String newData) throws IOException {
		File f = new File("J:\\Code\\Automationn\\MavenInstall\\Data\\Excel\\newFile.xlsx");
		Workbook wb = new XSSFWorkbook();
		Sheet newSheet = wb.createSheet("Datas");
		Row newRow = newSheet.createRow(rowNum);
		Cell createCell = newRow.createCell(cellNum);
		createCell.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
	
	public static void createCell(int rowNum, int cellNum, String newData) throws IOException {
	    File f = new File("J:\\Code\\Automationn\\MavenInstall\\Data\\Excel\\newFile.xlsx");

	    // Load existing workbook
	    FileInputStream fis = new FileInputStream(f);
	    Workbook wb = new XSSFWorkbook(fis);
	    Sheet newSheet = wb.getSheet("Datas");

	    if (newSheet == null) {
	        newSheet = wb.createSheet("Datas"); // If the sheet doesn't exist, create it
	    }

	    // Get the row; create it if it doesn't exist
	    Row newRow = newSheet.getRow(rowNum);
	    if (newRow == null) {
	        newRow = newSheet.createRow(rowNum);
	    }

	    // Create a cell and set its value
	    Cell createCell = newRow.createCell(cellNum);
	    createCell.setCellValue(newData);

	    // Write back to the file
	    FileOutputStream fos = new FileOutputStream(f);
	    wb.write(fos);
	}

	public static void createRow(int creRow, int creCell, String newData) throws IOException {
		File f = new File("J:\\Code\\Automationn\\MavenInstall\\Data\\Excel\\newFile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet c = wb.getSheet("Datas");
		Row r = c.createRow(creRow);
		Cell createCell = r.createCell(creCell);
		createCell.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
}
