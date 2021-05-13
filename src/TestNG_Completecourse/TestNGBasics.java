package TestNG_Completecourse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGBasics {

	WebDriver driver;

	@BeforeMethod
	public void GooglePageSetup() {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	}

//	@before method annotation----Condition starts with @Before
//@post condition---starts with @post 	
//test cases starts with @Test annotation	
	// which will get executed first and then the test case will get executed and then after method. 
//	beforemethod---first Testcases---aftermethod, beforemethod--secondtestcases-aftermethod, they will pair and execute in the similar way everytime , this the hirachy which will be followed for each test case written
//	Test cases can be runned on priority, which needs to be executed first
//	we can also group the one which we want to execute first
//	
//	
//	
	@Test(priority=3,groups="Testlink")
	public void TestGoogleSearchdisplayed() {

		Boolean b = driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).isDisplayed();
		System.out.println(b);

	}

	@Test(priority=4)
	public void Testlink() {

		driver.findElement(By.linkText("Gmail")).click();

	}

	@Test(priority=2)
	public void GooglUrl() {
		String Url = driver.getCurrentUrl();
		System.out.println(Url);

	}

	@Test(priority=1,groups="GooglUrl")
	public void GoogleTitle() {
		String Title = driver.getTitle();
		System.out.println(Title);

	}

	@AfterMethod
	public void CloseChrome() {
		driver.quit();
	}

}
