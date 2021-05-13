package dropdown_selectconcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown_withhel_utilitymethod {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver90\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

		String day_month = "//select[@id='month']//option";
		String day_s = "//select[@id='day']//option";
		String day_year = "//select[@id='year']//option";
		dropdownlist(day_s, "2");
		dropdownlist(day_month, "Jul");
		dropdownlist(day_year, "1990");

	}

	public static void dropdownlist(String xpathvalue, String values)

	{

		List<WebElement> List_Ele = driver.findElements(By.xpath(xpathvalue));
		int lislen = List_Ele.size();
		System.out.println(List_Ele.size());

		for (int i = 0; i < lislen; i++) {
			System.out.println(List_Ele.get(i).getText());

			if (List_Ele.get(i).getText().equals(values)) {
				List_Ele.get(i).click();
				break;
			}

		}

	}

}
