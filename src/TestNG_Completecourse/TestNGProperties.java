package TestNG_Completecourse;

import org.testng.annotations.Test;

public class TestNGProperties {

	// dependicywisetesting---using keyword--dependsonmethods
   // it means get url page is totally login page, if login page is getting failed then no further
//	execution will happen, it wuill be skipped

	@Test
	public void loginPage() {
		System.out.println("loginPage");
		
		int i=9/0; //arthemeticexpection error
	}

	@Test(dependsOnMethods = "loginPage")
	public void GetUrl() {
		System.out.println("GetUrl");
	}

	@Test(dependsOnMethods= "loginPage")
	public void GetTittle() {
		System.out.println("GetTittle"	);

	}

}
