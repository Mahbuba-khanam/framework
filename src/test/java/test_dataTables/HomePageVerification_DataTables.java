package test_dataTables;

import base.Base;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class HomePageVerification_DataTables extends Base {

	public static void main(String[] args) throws InterruptedException {
		
			startUp();
			navigate("https://datatables.net");
			Thread.sleep(5000);
	
			// Get page titleC:\Users\mahbu\AppData\Roaming\Microsoft\Windows\Start Menu\Programs
			System.out.println(page.title());
			Thread.sleep(5000);
			// title page verification
			assertThat(page).hasTitle("DataTables | Table plug-in for jQuery");
			Thread.sleep(5000);
			// Manual button Verification
			assertion("(//a[text()='Manual'])[1]", "Manual");
			Thread.sleep(5000);
			p("Thanks for visiting this website");
			// close the browser

			close_All();

		

	}
}