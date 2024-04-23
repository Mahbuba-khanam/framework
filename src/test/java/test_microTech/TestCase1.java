package test_microTech;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import base.Base;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import java.nio.file.Paths;
import java.util.ArrayList;

public class TestCase1 extends Base{

	public static void main(String[] args) {
		startUp();
		String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
//		Playwright playwright;
//		playwright = Playwright.create();
//
//		ArrayList<String> arguments = new ArrayList<>();
//		arguments.add("--start-maximized");
//
//		LaunchOptions launchOptions;
//		launchOptions = new BrowserType.LaunchOptions().setHeadless(false).setArgs(arguments)
//				.setExecutablePath(Paths.get(chromePath));
//
//		Browser browser;
//		browser = playwright.chromium().launch(launchOptions);
//
//		BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
//
//		
//		Page page;
//		page = browser.newPage();

		page.navigate("https://it.microtechlimited.com");

		// verify Page Title
		 assertThat(page).hasTitle("MicroTech NA");
		
		page.locator("//a[@href='elogin.php']").click();

		page.locator("//a[@href='clogin.php']").click();

		page.locator("//input[@name='mailuid']").fill("david@gmail.com");

		page.locator("//input[@name='pwd']").fill("1234");

		page.locator("//input[@name='login-submit']").click();

		String welcomeMessage = page.locator("//h2[2]").innerText();

		System.out.println(welcomeMessage);
		close_All();

	}

}
