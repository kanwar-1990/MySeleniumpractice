package Programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class readpropercode {

	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {

		Properties prop = new Properties();
		FileInputStream id = new FileInputStream(
				"C:\\Users\\knwrp\\eclipse-workspace\\Seleniumfirstprogram\\src\\Programs\\objectrepo.properties");
		prop.load(id);

		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		String browser = prop.getProperty("browser_name");
		System.out.println(browser);

		String url = prop.getProperty("url");
		System.out.println(url);

		if (browser.equals("firefox")) {
			driver = new FirefoxDriver();

			System.setProperty("webdriver.driver.gecko", "C:\\geckodriver.exe");
		} else if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		}

		driver.get(url);
		driver.findElement(By.name(prop.getProperty("Enter_username"))).sendKeys("name_test");
		driver.findElement(By.xpath(prop.getProperty("Enter_password"))).sendKeys("password_test");
	}

}
