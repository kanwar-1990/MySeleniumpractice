package Programs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seventeenapril {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.google.com/");
		driver.get("https://www.demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
		Alert g = driver.switchTo().alert();
		String f = g.getText();

		System.out.println(f);
		Thread.sleep(2000);
		g.accept();
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().refresh();
		driver.findElement(By.id("alertButton")).click();
		g.accept();
	}

}
