package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathgenius {

	public static void main(String[] args)

	{

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver r1 = new ChromeDriver();
		r1.get("http://thedemosite.co.uk/login.php");
		r1.findElement(By.xpath("//input[@name='username']")).sendKeys("test");
		r1.findElement(By.xpath("//input[@name='password' and @type='password']")).sendKeys("test");
		r1.findElement(By.xpath("//input[ @type='button']")).click();
		r1.findElement(By.linkText("Now move on to the final section")).click();
		r1.findElement(By.xpath("//div[@align='center']//a[text()='phpFormMailer']")).click(); // contains or text()
																								// function can be used

		// dynamic id
		// id="test_123"
		// id="test_345" starts-with
		// id="125_test_t" ends-with
		// every time tester closes an app if the id keep on changing, tester cannot
		// come back and keep on changing the id ,hence he can use
		// contain function in xpath
		r1.findElement(By.xpath(
				"//input[Contains[@id,'test_'../or //input[Contains[@starts-with,'test_']]...input[Contains[@ends-with,'test_t']].."))
				.sendKeys("hello");
		// r1.findElement(By.xpath("//a[contains(text(),'test1 test
		// '])/parent::td//preceding-sibling::td//forward-sibling")).click();

		// custom xpath helps to select check boxes also , with the help of parent and
		// sibling we can work on hirechy loop

	}

}
