package Programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandler {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		driver.findElement(By.xpath("//a[@title='Follow @seleniumeasy on Facebook']")).click();

		// TYPES OF POP UP

		// alerts--javascript pop up---Alert api (accept,dismiss)
		// file upload pop up --browser button (type--file,sendkeys(path)
		// browser window pop up -advertisement pop up (window handler
		// API--GETWINDOWHANDLES())
		Set<String> handler = driver.getWindowHandles(); // to get window id, which will give u a set object
		// but the challenge is it will not give the value of the index like 1,2,3 , for
		// loop is not possible . for that we use iterator
		Iterator<String> it = handler.iterator(); // iterator will point just above the set object

		String parentwindow_id = it.next(); // we use this to make iterator to point the first location
		System.out.println("Parent window id is " + parentwindow_id);

		String childwindow_id = it.next();// to point at second location
		System.out.println("Child window id is" + childwindow_id);

		driver.switchTo().window(childwindow_id); // we use switch to make window at page position the
		System.out.println("Child title id: " + driver.getTitle()); // to get the title
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parentwindow_id);
		System.out.println("Get parent title id: " + driver.getTitle());// to get the title

	}

}
