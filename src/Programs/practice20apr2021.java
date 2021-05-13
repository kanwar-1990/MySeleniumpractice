package Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class practice20apr2021 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*
		 * //driver.get("https://www.demoqa.com/droppable"); //Actions act=new
		 * Actions(driver);
		 * //act.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(
		 * driver.findElement(By.id("droppable"))).release().build().perform();
		 * //driver.close();
		 */
		driver.get("https://www.demoqa.com/automation-practice-form");
//		driver.findElement(By.id("firstName")).sendKeys("kanwar");
//		driver.findElement(By.id("lastName")).sendKeys("singh");
//		driver.findElement(By.id("userEmail")).sendKeys("knwrpl.singh@gmail.com");
//		driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
//		driver.findElement(By.id("userNumber")).sendKeys("9066549545");
//		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
//		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\chromedriver");
//		driver.findElement(By.id("currentAddress")).sendKeys("#18,10th cross thimmaiah garden rt nagar");

		Thread.sleep(7000);

	driver.findElement(By.xpath("//div[@id='state']")).click();
	
	}

}
