package practingselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findingthelistofallwebelement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver90\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		// driver.close();
	    driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("java");
	    List<WebElement> List_size=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
	    
	    System.out.println(List_size.size());

	    for(int i=0;i<List_size.size();i++)
	    {
	    	
	    	System.out.println(List_size.get(i).getText());
	    	
	    	if(List_size.get(i).getText().equals("javatpoint"))
	    	{
	    		List_size.get(i).click();
	    	}
	    }
	    
	}

}
