package test_dataTables;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import base.Base;

import com.microsoft.playwright.BrowserType.LaunchOptions;

public class Test_DropDown extends Base {

	public static void main(String[] args) {
		startUp();
		String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";

		page.navigate("https://datatables.net");

		// Select drop down menu
		System.out.println(page.locator("//select[@name='example_length']").innerText());
		// manual
		page.locator(
				"body > div.fw-container > div.fw-header.ad > div.nav-wrapper > div.nav-search > div.nav-item.i-manual > a")
				.click();
		// page.locator("//a[text()='Manual'])[1]").click();
		page.locator("body > div.fw-container > div.fw-body > div > div > div:nth-child(1) > h3 > a").click();
		// page.locator("//h1[@class='page_title']").click();
		// assertThat(page).hasTitle("Manual");

		// page.locator("//i[@class='dt-demo-icon theme light']").click();

		assertThat(page.locator("body > div.fw-container > div.fw-body > div > h1")).hasText("Installation");
		// close();
	}
}
