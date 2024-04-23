package test_dataTables;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import base.Base;

import com.microsoft.playwright.BrowserType.LaunchOptions;

public class Test_Purchase extends Base {

	public static void main(String[] args) {
		startUp();
		String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
		
		page.navigate("https://datatables.net");
		page.locator("//a[text()='Purchase']").click();
		// Click on first Buy now button
		page.locator("(//button[@class='purchase site-btn'])[1]").click();
		page.locator("//input[@id='DTE_Field_register-username']").fill("James");
		page.locator("//input[@id='DTE_Field_register-password']").fill("Randle");
		//click("//button[@class='btn']");
		

	}
}
