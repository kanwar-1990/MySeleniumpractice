package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingbrowserfileuploadpopup {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver fof = new ChromeDriver();
		fof.get("https://html.com/input-type-file/"); // for options like choosing a file, browsing a file pop up we can
														// use this
		fof.findElement(By.name("fileupload")).sendKeys("C:\\Users\\knwrp\\OneDrive\\Desktop\\chromedriver_win32");
	}

}
