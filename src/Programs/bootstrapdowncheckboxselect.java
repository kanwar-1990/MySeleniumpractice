package Programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class bootstrapdowncheckboxselect {

	public static void main(String[] args) {

		// System.setProperty("driver.chrome.webdriver", "C:\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
		// WebDriver driver = new ChromeDriver();
		WebDriver driver = new InternetExplorerDriver();

		// driver.manage().window().maximize();
		// driver.manage().deleteAllCookies();
		// driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_10");

		driver.findElement(By.xpath("//button[@data-toggle='dropdown']")).click();

		List<WebElement> list = driver
				.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++)

		{
			System.out.println(list.get(i).getText());
			list.get(i).click();

			// CHECK BOX IS GETTING CLICKED BUT ITS NOT VISIBLE

			// if (list.get(i).getText().equals("CSS"))

			// {
			// list.get(i).click();
			// break;
			// }

		}

	}
}
