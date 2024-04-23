



package test_microTech;

import java.nio.file.Paths;
import java.util.ArrayList;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import base.Base;
import com.microsoft.playwright.BrowserType.LaunchOptions;

//import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class Test_Customer_Login extends Base {

	
	public static void main(String[] args) {
		p("Welcome to MicroTech NA.");
		

		startUp();

		navigate("https://it.microtechlimited.com");

		click("//a[@href='elogin.php']");

		click("//a[@href='clogin.php']");

		fill("//input[@name='mailuid']", "david@gmail.com");

		fill("//input[@name='pwd']", "1234");

		click("//input[@name='login-submit']");

		String welcomeMessage = innerText("//h2[2]");

		System.out.println(welcomeMessage);
		assertion("//*[@id='divimg']/div/h2[2]", "Welcome David");

	//	browserClose();
		

	}	

}
