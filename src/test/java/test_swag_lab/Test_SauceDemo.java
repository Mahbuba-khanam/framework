package test_swag_lab;

import base.Base;

public class Test_SauceDemo extends Base {

	public static void main(String[] args) throws InterruptedException {
		startUp();

		navigate("https://www.saucedemo.com/");
		assertion("// div [@class= 'login_logo']", "Swag Labs");

		fill("#user-name", "standard_user");
		fill("#password", "secret_sauce");
		click("#login-button");
		click("//div [text()='Sauce Labs Backpack']");
		// add to cart
		click("#add-to-cart-sauce-labs-backpack");
		// click remove
		click("#remove-sauce-labs-backpack");

		page.goBack();
		click("#add-to-cart-sauce-labs-fleece-jacket");
		click(".shopping_cart_link");
		click("#continue-shopping");
		click("(//div[@class='inventory_item_name '])[6]");
		click("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']");
		click(".shopping_cart_link");
		click("#checkout");
		fill("//input[@placeholder='First Name']","James");
		fill("//input[@placeholder='Last Name']","Randle");
	   // fill("//input[placeholder='Zip/Postal Code']","123456");
	    fill("//input[@placeholder='Zip/Postal Code']","85286");
	   click("//button[@id='finish']");
	   Selection("//select[@class='product_sort_container']","za");
		click("//button[@id='add-to-cart-sauce-labs-onesie']");
	   click("//button[@id='back-to-products']");
	 //verify finish page
	 		String welcomeMessage1 =innerText("//span[text()='Checkout: Complete!']");		
	 		System.out.println(welcomeMessage1 );
	 		assertion("//span[text()='Checkout: Complete!']","Checkout: Complete!");
	 		Thread.sleep(2000);
	 		String welcomeMessage =innerText("//h2");		
	 		System.out.println(welcomeMessage );
	 		click("//button[@id='back-to-products']");
	 		p("Please don't forget to visit again");
	 			
	 		//click menu bar for log out 
	 		Thread.sleep(1000);
	 		click("//button[@id='react-burger-menu-btn']");
	 		Thread.sleep(1000);
	 		//click log out
	}

}
