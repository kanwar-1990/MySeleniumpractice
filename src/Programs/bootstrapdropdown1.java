package Programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstrapdropdown1 {

	public static void main(String[] args) throws InterruptedException {
		// when ever in drop down there is no select class we cannot use to create an
		// object,hence where ever us see button
		// option, they might have used boot strap

		System.setProperty("driver.webdriver.chrome", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		driver.get("https://v4-alpha.getbootstrap.com/components/dropdowns/");
		driver.findElement(By.id("dropdownMenuButton")).click();
		List<WebElement> list = driver.findElements(By.xpath("//div[@aria-labelledby='dropdownMenuButton']//a"));

		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());

			if (list.get(i).getText().equals("Something else here")) {
				Thread.sleep(2000);
				list.get(i).click();
			}

		}
	}

}
