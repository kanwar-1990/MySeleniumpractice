package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class url {

	public static void main(String[] args)

	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String a = driver.getCurrentUrl(); // to get the URL ,used need to create local variable to store the URL
		System.out.println(a);
		String b = driver.getTitle(); // to get the title ,create a local variable to store title value
		System.out.println(b);
		driver.quit();

	}

}
