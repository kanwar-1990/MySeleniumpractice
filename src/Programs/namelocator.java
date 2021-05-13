package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class namelocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("wedriver.driver.chrome", "C:\\chromedriver.exe");
		WebDriver junu = new ChromeDriver();
		junu.get("https://www.facebook.com/");
		junu.findElement(By.name("email")).sendKeys("shubnam");

	}

}
