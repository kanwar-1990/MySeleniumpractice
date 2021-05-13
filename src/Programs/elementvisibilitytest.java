package Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementvisibilitytest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");

		WebElement first = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
		first.click();
		Boolean c = first.isSelected();
		System.out.println(c);

		// Difference between isDisplayed(), isEnabled() and isSelected() Methods
		// Selenium WebDriver:

		// 1. isDisplayed() is the method used to verify the presence of a web element
		// within the web page. The method returns a “true” value if the specified web
		// element is present on the web page and a “false” value if the web element is
		// not present on the webpage.
		// 2. isDisplayed() is capable to check for the presence of all kinds of web
		// elements available.
		// 3. isEnabled() is the method used to verify if the web element is enabled or
		// disabled within the web page.
		// 4. isEnabled() is primarily used with buttons.
		// 5. isSelected() is the method used to verify if the web element is selected
		// or not. 6. isSelected() method is predominantly used with radio buttons,
		// dropdowns and checkboxes.

	}

}
