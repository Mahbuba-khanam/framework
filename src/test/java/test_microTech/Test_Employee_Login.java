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

import com.microsoft.playwright.BrowserType.LaunchOptions;

public class Test_Employee_Login extends Base {
	//static Page page;

	public static void main(String[] args) {
	startUp();

		navigate("https://it.microtechlimited.com");
		click("//a[@href='elogin.php']");

		fill("//input[@name='mailuid']","testpilot@gmail.com");
		fill("//input[@name='pwd']", "1234");

		click("//input[@name='login-submit']");

		String employeeId = page.locator("//h2[1]").innerText();

		System.out.println(employeeId);

	}

}
