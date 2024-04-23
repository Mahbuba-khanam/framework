package test_microTech;

import base.Base;

public class HomePageVerification extends Base {

	public static void main(String[] args ) {
		startUp();
		navigate("https://it.microtechlimited.com");
		assertion("//h1[text()='Welcome to MicroTech NA.']","Welcome to MicroTech NA.");

	}

}
