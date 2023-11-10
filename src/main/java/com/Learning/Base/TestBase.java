package com.Learning.Base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import com.Naveenautomation.Browsers.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver wd=null;

	private final Browser DEFAULT_BROWSER = Browser.CHROME;
	private final String URL = "https://naveenautomationlabs.com/opencart/index.php?route=account/login";

	// private static final boolean RUN_ON_GRID = false;

	public void intialization() {

		switch (DEFAULT_BROWSER) {
		case CHROME:
			wd = WebDriverManager.chromedriver().create();
			break;
		case EDGE:
			wd = WebDriverManager.edgedriver().create();
			break;
		case FIREFOX:
			wd = WebDriverManager.firefoxdriver().create();
			break;
		default:
			throw new IllegalArgumentException();

		}

		wd.manage().window().maximize();

		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void tearDown() {
		wd.quit();
	}

}
