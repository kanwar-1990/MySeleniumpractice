package Programs;

// opening and closing using selenium 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenClose {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.driver.gecko", "C:\\geckodriver.exe");
		// WebDriver hello = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.quit();
		driver.getTitle(); // Error--org.openqa.selenium.NoSuchSessionException
		// hello.get("https://www.google.com");
		// hello.quit();

	}

}
