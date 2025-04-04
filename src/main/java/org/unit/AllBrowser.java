package org.unit;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
public class AllBrowser extends BaseClass{
	 @Parameters("browser")
	    @BeforeMethod
	    public void setUp(@Optional("chrome") String browser) {
	        launchBrowsers(browser);
	        openUrl("https://www.amazon.com");
	    }

	    @Test(priority = 1)
	    public void enterUsername() throws InterruptedException {
			JavascriptExecutor js = (JavascriptExecutor) driver;
//			WebElement img = driver.findElement(By.xpath("//a[text()='Try different image']"));
//			img.click();
			Thread.sleep(6000);
			WebElement sign = driver.findElement(By.xpath("//div[@class='nav-div' and @id='nav-link-accountList']"));
			sign.click();
			WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
			js.executeScript("arguments[0].setAttribute('value', 'jiju@gmail.com')", email);
            pageTitle("Amazon Sign-In");
            
	  
	    }

	  

	    @AfterMethod
	    public void tearDown() {
            closeBrowser();
	    }
}
