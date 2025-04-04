package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FbLogin {
	public FbLogin() {
	}

	@FindBy(id = "email")
	private WebElement email;
	@FindBy(xpath = "//input[@aria-label='Password']")
	private WebElement password;
	@FindBy(name = "login")
	private WebElement login;
	
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}

	
}
