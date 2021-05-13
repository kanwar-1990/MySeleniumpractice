package TestNG_Completecourse;

import org.testng.annotations.Test;

public class InnvocationKeyword {

	@Test(invocationCount = 5)
	public void GetUrl() {
		System.out.println("GetUrl");
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("Sum od c===>" + c);
	}

}
