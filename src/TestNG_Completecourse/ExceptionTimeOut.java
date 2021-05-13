package TestNG_Completecourse;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class ExceptionTimeOut {

	
	@Test(expectedExceptions=NumberFormatException.class)
	public void InfinityLoop() {
		int i=1;
		while(i==1)
		{
			System.out.println(i);
		}
		
	}
}
