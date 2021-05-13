package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousemovement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver gogj = new ChromeDriver();
		gogj.manage().window().maximize();
		gogj.get("https://www.spicejet.com/");
		Actions bob = new Actions(gogj);
		Thread.sleep(3000);
		bob.moveToElement(gogj.findElement(By.id("highlight-addons"))).perform();
		Thread.sleep(3000);
		gogj.findElement(By.linkText("MyFlexiPlan")).click();
	}

}
 