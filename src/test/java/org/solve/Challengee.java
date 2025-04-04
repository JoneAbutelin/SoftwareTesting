package org.solve;

import org.base.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Challengee extends BaseClass {
	
	@Test(priority = 1)
    public void openGmail() {
        openUrl("https://mail.google.com/");
    }

    @Test(priority = 2)
    public void openInmakes() {
        openUrl("https://inmakeslh.in/");
    }

    @Test(priority = 3)
    public void openRedubs() {
        openUrl("https://www.redbus.in/");
    }

    @Test(priority = 4)
    public void openFlipkart() {
        openUrl("https://www.flipkart.com/");
    }

    @Test(priority = 5)
    public void openAmazon() {
        openUrl("https://www.amazon.in/");
    }

    @Test(priority = 6)
    public void openFacebook() {
        openUrl("https://en-gb.facebook.com/");
    }

    @Test(priority = 7)
    public void openYouTube() {
        openUrl("https://www.youtube.com/");
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
