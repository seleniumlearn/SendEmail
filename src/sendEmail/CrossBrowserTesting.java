package sendEmail;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class CrossBrowserTesting {
	public WebDriver driver;
	
	@Test
    public void Run() throws Exception {
        driver.manage().window().maximize();
        driver.get("http://www.seleniumlearn.com");

        Thread.sleep(7000);
        //driver.close();
    }
  @Parameters({ "browser" })
  @BeforeTest
  public void openBrowser(String browser) {

      try {

          if (browser.equalsIgnoreCase("Firefox")) {
              driver = new FirefoxDriver();
          } 

          else if (browser.equalsIgnoreCase("Chrome")) {
              System.setProperty("webdriver.chrome.driver","C:\\lib-selenium\\chromedriver.exe");
              driver = new ChromeDriver();
          } 
          else if (browser.equalsIgnoreCase("IE")) {
              System.setProperty("webdriver.ie.driver","C:\\lib-selenium\\IEDriverServer.exe");
              driver = new InternetExplorerDriver();
          }

          /*else if (browser.equalsIgnoreCase("opera")) {
              System.setProperty("webdriver.opera.driver","D:\\lib\\operadriver.exe");  //--->IE for Windows path
              driver=new OperaDriver();
           }

      else if (browser.equalsIgnoreCase("safari")) {
          System.setProperty("webdriver.safari.driver", "D:\\lib\\SafariDriver.exe"); //To stop uninstall each time
           driver = new SafariDriver();
           driver.get("http://www.google.com");
          }*/

      } 
      catch (WebDriverException e) {
          System.out.println(e.getMessage());
      }
  }

  @AfterTest
  public void afterTest() {
  }

}
