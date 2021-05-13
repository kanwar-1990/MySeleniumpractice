package Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printlinks {

	public static void main(String[] args)

	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver gogo = new ChromeDriver();
		gogo.get("https://www.amazon.in/");
		List<WebElement> c = gogo.findElements(By.tagName("a"));

		int sizeofb = c.size();// to get the number of links or webelement
		System.out.println(sizeofb);

		for (int i = 0; i < sizeofb; i++) // to print each link , for loop will take first link at a time, second link
											// at time
		{
			WebElement b = c.get(i);// to get single element and store it in a webelement, what is present at each
									// location , first location, second location
			String a = b.getText();// to get the link in text format
			System.out.println(a);// to print the each link
		}
	}

}
