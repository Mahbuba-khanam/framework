package test_panaya;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import base.Base;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class Test_Panaya extends Base {

	public static void main(String[] args) throws InterruptedException {
		startUp();

		page.navigate("https://panaya.com");
		page.locator("//a[@class='navbar-brand logo-wrap--secondary']").click();
		page.locator("#menu-item-61").click();
		page.locator("//*[@id=\"menu-item-45534\"]/a").click();
		Thread.sleep(2000);

		String message = innerText(
				"#b-featured-resources-carousel-1 > div > div > div.b-featured-resources-carousel__head > h2 > span");
		System.out.println(message);
		Thread.sleep(2000);
		Thread.sleep(2000);

		p("Thanks for visiting our website");

		close_All();

	}

}
