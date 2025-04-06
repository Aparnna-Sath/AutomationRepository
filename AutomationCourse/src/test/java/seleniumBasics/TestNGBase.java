package seleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;

public class TestNGBase
{
   public WebDriver driver;
    @BeforeMethod
     public void initialiseBrowser() 
    {
        driver = new ChromeDriver(); // for Chrome launch
        driver.get("https://www.saucedemo.com/v1/"); // open the URL
        driver.manage().window().maximize(); // maximize the browser window

       
    }
    
    @AfterMethod
    public void driverCloseAndQuit()
    {
    	
     //   driver.quit(); // quit driver
    }
}
