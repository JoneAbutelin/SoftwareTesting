package org.solve;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrows {

	 @Parameters("browser")
	 @Test
	    public void tc1(String browser) {
		   WebDriver driver;
	        if (browser.equals("chrome")) {
	            WebDriverManager.chromedriver().setup();
	            driver = new ChromeDriver();
	        } else if (browser.equals("firefox")) {
	            WebDriverManager.firefoxdriver().setup();
	            driver = new FirefoxDriver();
	        } else { 
	            WebDriverManager.edgedriver().setup();
	            driver = new EdgeDriver();
	        } 

	        driver.manage().window().maximize();
	        driver.get("https://www.flipkart.com/");
	    }
}
