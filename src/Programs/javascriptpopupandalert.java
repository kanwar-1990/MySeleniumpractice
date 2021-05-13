package Programs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptpopupandalert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver gah = new ChromeDriver();
		gah.get("http://thedemosite.co.uk/login.php");

		gah.findElement(By.name("FormsButton2")).click();
		Thread.sleep(10000);
		Alert op = gah.switchTo().alert();// to switch window as the pop up cannot be printed so to make pop up into a
											// window switchto.alert() is used
		System.out.println(op.getText());
		String text = op.getText();

		op.accept();// to click on ok button
		// op.dismiss();// if a pop up has ok and cancel to click on cancel button we
		// need to call dismiss
		// for browser also same thing

	}

}
