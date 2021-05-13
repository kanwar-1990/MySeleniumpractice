package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class textlinklocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver ganga = new ChromeDriver();
		ganga.get("https://www.facebook.com/");
		// ganga.findElement(By.linkText("Create a Page")).click(); to find the link and
		// take action on in
		ganga.findElement(By.partialLinkText("Page")).click(); // to locate partial link and taking action on it by
																// click();
	}

}
