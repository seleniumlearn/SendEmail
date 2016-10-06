package sendEmail;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class SendAmail {
	WebDriver driver;
	
	
 
@Test
    public void method2() throws Exception{
        driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
        driver.get("http://www.google.com");
        System.out.println("This is method 2");
        Thread.sleep(3000);
    }


@Test(dependsOnMethods={"method2"})
public void method1() {
    driver.findElement(By.name("q")).sendKeys("seleniumtool.com");
    System.out.println("This is method 1");
}

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\lib-selenium\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
  }

}
