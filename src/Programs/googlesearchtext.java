package Programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlesearchtext {

	public static void main(String[] args) throws InterruptedException

	{

		System.setProperty("driver.webdriver.chrome", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");

		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java");
		Thread.sleep(1000);
		List<WebElement> list = driver
				.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));

		System.out.println("total number of list elements java ===>" + list.size());

		for (int i = 0; i < list.size(); i++)

		{
			System.out.println(list.get(i).getText());

			if (list.get(i).getText().equals("javatpoint")) {
				list.get(i).click();
				break;
			}
		}

	}

}
