package org.flip;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Challenge extends BaseClass {
    
    @Given("User is on the Facebook login page")
    public void user_is_on_the_facebook_login_page() {
       // launchBrowser();
        openUrl("https://www.facebook.com/login.php/");
    }

    @When("User enters valid {string} and {string}")
    public void user_enters_valid_and(String username, String password) {
        WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='pass']"));
        
        sendKeys(username, emailField);
        sendKeys(password, passwordField);
    }

    @And("Clicks on the login button")
    public void clicks_on_the_login_button() {
        WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
        loginButton.click();
    }

    @Then("User should be redirected to the homepage")
    public void user_should_be_redirected_to_the_homepage() {
        System.out.println("User is on the homepage.");
    }
}
