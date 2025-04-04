package org.fb;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPojo extends BaseClass {

    public SignInPojo() {
         PageFactory.initElements(driver, this);
         }

    @FindBy(xpath = "//a[text()='Create new account']")
    private WebElement createNewAcc;

    @FindBy(xpath = "(//input[@type='text'])[1]")
    private WebElement firstNameTxtBox;

    @FindBy(name = "lastname")
    private WebElement secondNameTxtBox;

    @FindBy(name = "reg_email__")
    private WebElement mobileOrEmailTextBox;

    @FindBy(xpath = "(//input[@id='password_step_input'])[1]")
    private WebElement newPassword;

	public WebElement getCreateNewAcc() {
		return createNewAcc;
	}

	public WebElement getFirstNameTxtBox() {
		return firstNameTxtBox;
	}

	public WebElement getSecondNameTxtBox() {
		return secondNameTxtBox;
	}

	public WebElement getMobileOrEmailTextBox() {
		return mobileOrEmailTextBox;
	}

	public WebElement getNewPassword() {
		return newPassword;
	}
}