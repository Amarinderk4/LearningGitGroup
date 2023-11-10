package com.Learning.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Learning.Base.TestBase;

public class AccountPage extends TestBase {

	public AccountPage() {
	
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "#content>h2:first-of-type")
	WebElement myAccountText;

	@FindBy(css = "div.alert-success")
	WebElement acccountInfoUpdateSuccessMessage;// edit account

	// Success: Your account has been successfully updated.

	@FindBy(xpath = "//a[text()='Edit your account information']")
	WebElement editYourInfoLink;

	@FindBy(xpath = "//a[text()='Change your password']")
	WebElement accountPassword;

	
	@FindBy(css = "div.alert-success ")
	WebElement accountNewsletterSuccessMessage;

	@FindBy(xpath = "//input[@value='Continue']")
	WebElement accountNewsletterSubmitBtn;



	public String getMyAccountText() {
		return myAccountText.getText();
	}

	public String getSuccessMessage() {
		return acccountInfoUpdateSuccessMessage.getText();
	}


	public String getNewsletterSubscSuccessMessage() {
		return accountNewsletterSuccessMessage.getText();
	}

}
