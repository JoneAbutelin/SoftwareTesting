package org.fb;
import java.util.List;
import java.util.Map;

import org.base.BaseClass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


//import io.cucumber.java.en.*;

public class FbSignUp extends BaseClass {
	SignInPojo s;
	@Given("To launch the browser and maximise the window")
	public void to_launch_the_browser_and_maximise_the_window() {
	    launchBrowser();
	}

	@When("To launch URL of FB application")
	public void to_launch_url_of_fb_application() {
	   openUrl("https://www.facebook.com/");
	}

	@When("To click the create new account button")
    public void to_click_the_create_new_account_button() throws InterruptedException {
        s = new SignInPojo();
        Thread.sleep(3000);
        clickBtn(s.getCreateNewAcc());
    }

    @When("To pass firstname in firstname text box")
    public void to_pass_firstname_in_firstname_text_box( DataTable d) {
    	List<String> l = d.asList();
        s = new SignInPojo();
        sendKeys(l.get(2), s.getFirstNameTxtBox());
      //  sendKeys("John", s.getFirstNameTxtBox());
    }

    @When("To pass secondname in secondname text box")
    public void to_pass_secondname_in_secondname_text_box(DataTable d) {
    	Map<Object, Object> m = d.asMap(String.class, String.class);
        s = new SignInPojo();
        sendKeys(m.get("sname").toString(), s.getSecondNameTxtBox());
       // sendKeys("Doe", s.getSecondNameTxtBox());
    }

    @When("To pass mobile number or email in email text box")
    public void to_pass_mobile_number_or_email_in_email_text_box(DataTable d) {
    	List<List<String>> ll = d.asLists();
        s = new SignInPojo();
        sendKeys(ll.get(1).get(1), s.getMobileOrEmailTextBox());
      //  sendKeys("johndoe@example.com", s.getMobileOrEmailTextBox());
    }

    @When("To create new password using new password text box")
    public void to_create_new_password_using_new_password_text_box() {
        s = new SignInPojo();
        sendKeys("Secure@123", s.getNewPassword());
    }

    @Then("To close the chrome browser")
    public void to_close_the_chrome_browser() {
    }
}
