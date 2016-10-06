package sendEmail;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Inclue {
	WebDriver driver;

	@Test
	public void facebook() {
		driver.get("http://www.fb.com");
	}

	@Test
	public void twitter() {
		driver.get("http://www.twitter.com");
	}

	@Test(priority=1)
	public void google() {
		driver.get("http://www.google.com");
	}



	@Test
	public void linkedin() {
		driver.get("http://www.linkedin.com");
	}

	@Test(priority=1)
	public void seleniumlearn() {
		driver.get("http://www.seleniumlearn.com");
	}


	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\lib-selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
	}

}
