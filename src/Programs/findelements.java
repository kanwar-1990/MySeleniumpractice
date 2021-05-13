package Programs;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver jani = new ChromeDriver();
		jani.get("https://www.google.com/");
		// List<WebElement> c=jani.findElements(By.linkText("google")); findelements
		// takes a parameter of by object and return type is list of webelements
		// with find elements any elements wi th the name as google or not, if it finds
		// it will give the list of webelements
		List<WebElement> c = jani.findElements(By.tagName("a"));
		int sizeofc = c.size();
		System.out.println(sizeofc);

	}

}
