package org.solve;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Challenge extends BaseClass {
 
	
	@DataProvider(name="sample data")
    private Object [] [] Data(){
		return new Object [][] {
			{"tv"},
			{"fridge"}
		};
    	
    }

//    @Parameters({"search"})
//	@Test
//	public void Test2(String e) {
//		openUrl("https://www.flipkart.com/");
//		WebElement element = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
//		element.sendKeys(e);
//		System.out.println("TC 2 Flipkart");
//		}

	@Test
	public void Test3() {
		openUrl("https://inmakeslh.in/");
		System.out.println("TC 3");

	}
	
	@Test(dataProvider = "sample data")
	private void Test4(String e) throws InterruptedException {
		openUrl("https://www.flipkart.com/");
		WebElement element = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		element.sendKeys(e);
		System.out.println("TC 4");

        
	}
	@BeforeClass
	private void launchTheBrowser() {
		launchBrowser();
	}

	@AfterClass
	public void close() {
		System.out.println("Close browser");
	}

}
