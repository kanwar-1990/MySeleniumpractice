package practingselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlesearchpracticing {
	
	
	public static void main(String[] args) {
	
	   System.setProperty("driver.chrome.webdriver","C:\\Users\\knwrp\\OneDrive\\Desktop\\chromedriver_win32 88(1)\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
	}

}
