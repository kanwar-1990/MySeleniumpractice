package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keysenuminsendkey {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.driver.chrom", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoqa.com/automation-practice-form");
		WebElement g = driver.findElement(By.id("firstName"));
		g.sendKeys("kanwars");
		Thread.sleep(2000);
		g.sendKeys(Keys.BACK_SPACE);
		g.sendKeys(Keys.CONTROL + "A");
		g.sendKeys(Keys.CONTROL + "C");
		WebElement k = driver.findElement(By.id("userEmail"));
		k.sendKeys(Keys.CONTROL + "V");

	}

}
