package com.Learning.PageTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Learning.Base.TestBase;
import com.Learning.Pages.AccountPage;

public class AccountTest extends TestBase {
	AccountPage accountPage;

	@BeforeMethod
	public void launch() {
		intialization();

	}

	@Test
	public void validateUserCanSubscribeNewsletter() {
		// accountPage = loginPage.SubmitLogin("amarinderk4@gmail.com", "shop1234");
		// newsletterPage = accountPage.clickSubscribeBtn();

		Assert.assertEquals(accountPage.getNewsletterSubscSuccessMessage(),
				"Success: Your newsletter subscription has been successfully updated!", "Subscription not updated");

	}

	
	@Test
	public void validateRecurringPayments() {
		// accountPage = loginPage.SubmitLogin("amarinderk4@gmail.com", "shop1234");

		Assert.assertEquals(accountPage.getMyAccountText(), "My Account", "User not return recurring payments");
	}
	@Test
	public void DemoTest1() {
		Assert.assertEquals(accountPage.getMyAccountText(), "My Account", "User not return recurring payments");
	}


	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}

}
