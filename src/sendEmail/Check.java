package sendEmail;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Check {
	WebDriver driver;
  @Test
  public void f() throws Exception{
	  driver.get("http://www.w3schools.com/JS/tryit.asp?filename=tryjs_alert2");
	
//	  driver.get("http://www.seleniumlearn.com/prompt-dialog-box");
	  Thread.sleep(6000);
	  driver.findElement(By.xpath("/html/body/button")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id='node-103']/div/div[1]/div/div/button")).sendKeys(Keys.ENTER);
	  driver.switchTo().alert().dismiss();
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\lib-selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
  }

}
