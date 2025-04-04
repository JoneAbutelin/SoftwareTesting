package org.unit;

import org.base.BaseClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WebsiteTests extends BaseClass {

    @Before
    public void setUp() {
        launchBrowser();
    }

    @Test
    public void testFacebook() {
        openUrl("https://www.facebook.com");
        pageTitle("Facebook – log in or sign up");  
    }

    @Test
    public void testAmazon() {
        openUrl("https://www.amazon.com");
        pageTitle("Amazon.com");  
    }

    @After
    public void tearDown() {
    }
}
