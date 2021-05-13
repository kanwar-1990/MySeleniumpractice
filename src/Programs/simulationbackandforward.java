package Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class simulationbackandforward {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.navigate().to("https://groww.in/login");
		// get() vs navigate).to difference is to launch the url and navigate.to() will
		// help to launch external url
		// if u are using any application url and want to navigate to some external
		// url---navigate().to is used

		driver.navigate().back(); // to simulate back
		Thread.sleep(2000);
		driver.navigate().forward();// to simulate forward
		Thread.sleep(2000);
		driver.navigate().refresh(); // to refresh

	}

}
