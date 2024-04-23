package test_dataTables;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import base.Base;


public class Test_InnerText extends Base{

	public static void main(String[] args) {
		startUp();

		navigate("https://datatables.net");
		String Text = innerText("//div[@class='nav-item active']/a");
		System.out.println(Text);
		click("//a[@class='register-action follow-link login']");
		fill("//input[@id='DTE_Field_signin-username']", "Neepa");
		fill("//input[@id='DTE_Field_signin-password']", "2345678");
		click("//button[@class='btn']");
		count_Table_Head("//table", "//tr[1]/th");
		// click("//select[@name='example_length']");
		// we clicked in the menu bar
		click("#example_length > label > select");
		// before clicking we need to find the select the div- meaning the main area at
		// the beginning of code
		arrowdown("div.dt-demo-selector__options");
	}
}
