package Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class idlocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver90\\chromedriver.exe");
		WebDriver kanwar = new ChromeDriver();
		kanwar.get("https://www.facebook.com//"); // id locator are unique
		kanwar.manage().deleteAllCookies();
		kanwar.manage().window().maximize();
		kanwar.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		kanwar.findElement(By.id("email")).sendKeys("kanwarsingh");

		String fox = kanwar.getCurrentUrl();

		System.out.println(fox);

		if (fox.equals("https://www.facebook.com/")) {
			System.out.println("url is correct");
		} else {
			System.out.println("url is incorrect");
		}

		Thread.sleep(2000);
		kanwar.quit();

	}
}
