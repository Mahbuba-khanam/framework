package test_swag_lab;

import base.Base;

public class Test_SauceDemo1 extends Base {

	public static void main(String[] args) throws InterruptedException {
		startUp();
		navigate("https://www.saucedemo.com/");
		// enter username
		fill("//input[@placeholder='Username']", "standard_user");
		// enter password
		fill("//input[@placeholder='Password']", "secret_sauce");
		// click Login button
		click("//input[@type='submit']");
		// verify login page
        assertion("//div[text()='Swag Labs']", "Swag Labs");
		Thread.sleep(2000);
		Selection("//select[@class='product_sort_container']", "za");
		Thread.sleep(1000);
		// add to cart
		click("//button[@id='add-to-cart-sauce-labs-onesie']");
		Thread.sleep(1000);
		// add to cart
		click("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']");
		// remove item
		click("//button[@id='remove-sauce-labs-onesie']");
		Thread.sleep(1000);
		// add to cart
		click("//button[@id='add-to-cart-sauce-labs-fleece-jacket']");
		Thread.sleep(1000);
		// click("//div[@id='shopping_cart_container']");
		click(".shopping_cart_link");
		// continue shopping
		Thread.sleep(1000);
		click("#continue-shopping");
		Thread.sleep(1000);
		click("(//div[@class='inventory_item_name '])[6]");
		Thread.sleep(1000);
		click(".shopping_cart_link");
		Thread.sleep(1000);
		click("#checkout");
		Thread.sleep(1000);
		fill("//input[@placeholder='First Name']", "James");
		Thread.sleep(1000);
		fill("//input[@placeholder='Last Name']", "Randle");
		Thread.sleep(1000);
		fill("//input[@placeholder='Zip/Postal Code']", "85283");
		Thread.sleep(1000);
		click("//input[@type='submit']");
		// click to finish
		click("//button[@id='finish']");
		Thread.sleep(1000);
		// verify finish page
		String welcomeMessage1 = innerText("//span[text()='Checkout: Complete!']");
		System.out.println(welcomeMessage1);
		assertion("//span[text()='Checkout: Complete!']", "Checkout: Complete!");
		Thread.sleep(2000);
		String welcomeMessage = innerText("//h2");
		System.out.println(welcomeMessage);
		click("//button[@id='back-to-products']");
		p("Thanks for visiting this website");

		// click menu bar for log out
		Thread.sleep(1000);
		click("//button[@id='react-burger-menu-btn']");
		Thread.sleep(1000);
		// click log out
		click("#logout_sidebar_link");
		// All close
		close_All();

	}

}
