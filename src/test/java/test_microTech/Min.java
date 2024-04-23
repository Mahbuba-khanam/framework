package test_microTech;

import java.nio.file.Paths;
import java.util.ArrayList;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;

import base.Base;

import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;

public class Min  {
	public static void main(String[] args) {
		
		String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
		// playwright declaration and creation
		Playwright playwright;
		playwright = Playwright.create();

		ArrayList<String> arguments = new ArrayList<>();
		arguments.add("--start-minimized");
		LaunchOptions launchOptions;
		launchOptions = new BrowserType.LaunchOptions().setHeadless(false).setArgs(arguments)
				.setExecutablePath(Paths.get(chromePath));

		Browser browser;
		browser = playwright.chromium().launch(launchOptions);

		BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
		Page page;
		page = context.newPage();
		page.navigate("https://it.microtechlimited.com");
		page.close();
	}

}
