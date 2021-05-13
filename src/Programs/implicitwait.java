package Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class implicitwait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver gogj = new ChromeDriver();
		gogj.manage().window().maximize(); // maximizing the window
		gogj.manage().deleteAllCookies(); // deleting all the cookies

		// Dynamic wait
		gogj.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);// time delay to load the page, to make selenium
																		// wait for 40 secs even if the page opens to 3
																		// sec
		// ex heavy wait e-commerse website takes times to open as they will have empty
		gogj.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// time delay to load the elements (Links , button
																		// etc)
		// Thread.sleep the complete script will be paused for some 20,30 secs , if the
		// elements is not found then its gone . thread.sleep can slow script if used at
		// multiple instances
		// best part of the dynamic wait is if element is found within 5 secs rest of
		// the 25 secs will be ignored it will not waitfor 25 secs

		gogj.get("https://www.spicejet.com/");
		Actions bob = new Actions(gogj);
		bob.moveToElement(gogj.findElement(By.id("highlight-addons"))).build().perform();
		gogj.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		bob.moveToElement(gogj.findElement(By.id("ctl00_HyperLinkLogin"))).build().perform();
		gogj.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// puting wait for all the elements

		bob.moveToElement(gogj.findElement(By.xpath("//a[contains(text(),'SpiceClub Members')]"))).build().perform();
		gogj.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		gogj.findElement(By.linkText("Member Login")).click();
	}

}
