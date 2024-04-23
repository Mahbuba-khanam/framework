package test_microTech;

import java.nio.file.Paths;
import java.util.ArrayList;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import base.Base;

public class Test_Create_Order extends Base {

	public static void main(String[] args) {
	startUp();

		//page.navigate("https://it.microtechlimited.com");
		// System.out.println(page.title());

		navigate("https://it.microtechlimited.com");

		click("//a[@href='elogin.php']");

		fill("//input[@name='mailuid']", "testpilot@gmail.com");

		fill("//input[@name='pwd']", "1234");

		click("//input[@name='login-submit']");

		click("//a[text()='Product Order']");

		page.selectOption("//select[@name='prodId']", "Camera");
		

		fill("//input[@name='ordDate']", "11/21/2023");

		click("//button[@type='submit']");

		System.out.println("Order Done");
		close_All();
	}

}
