package Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class htmlunitdriver {

	public static void main(String[] args) throws InterruptedException

	{

		System.setProperty("driver.chrome.webdriver", "C:\\chromedriver.exe");
		// WebDriver driver=new chromedriver();

		// html unit driver is not available in selenium 3.x version
		// html unit driver --- to download we need to download html unit driver jar
		// file
		// advantages of html driver : testing is happening behind the seen--no browser
		// execution of test cases is very fast ---improver performances of the script
		// not suitable for action class=--- user action, mouse movement,double
		// click,drag and drop
		// for small script to run 5-10 test cases
		// ghost driver---headless browser
		// html unit driver with java
		// --phantomJS--JAVASCRIPT
		//

		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9066549545");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Kanwar@07");

		String d = driver.getTitle();
		System.out.println("title before login " + d);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		String e = driver.getTitle();
		System.out.println("title after Login : " + e);

	}

}
