package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameshanlding {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver vc = new ChromeDriver();
		vc.get("https://ui.cogmento.com/");
		vc.manage().window().maximize();
		Thread.sleep(3000);
		vc.findElement(By.name("email")).sendKeys("knwrpl.singh@gmail.com");
		vc.findElement(By.name("password")).sendKeys("Kanwar@01");
		vc.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		Thread.sleep(3000);
		vc.findElement(By.xpath("//span[@class='item-text' and contains(text(),'Contacts')]")).click();
		// vc.switchTo().frame(arg0); used if frames are avaiable in website application
		// ,currently most of the web applications we do not use frames
		// however it can used. when ever u open a browser and then url or page is
		// launched the next thing is frames, selenium doesnt recognise frames so
		// switchto method is used

	}

}
