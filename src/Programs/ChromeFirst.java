package Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeFirst

{

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); // launch the driver in safe mode with no extension in it
		System.setProperty("webdriver.driver.chrome", "C:\\chromedriver90\\chromedriver.exe"); // to let Selenium know
																								// which browser is
																								// getting used Syntax
																								// used

		String url = driver.getCurrentUrl();
		System.out.println(url);

	}
}

// Webdriver = is nothing but interface , interface cannot be used to call an
// object
// driver = is nothing but local reference variable , we can write anything
// = is assignment operator
// new is an keyword used to provide a space in heap memory for object creation
// Chromedriver is created an object of class chromedriver by taking webdriver
// interface
// we can call implemented method of webdriver get,quit by the syntax WebDriver
// driver= ChromeDriver();