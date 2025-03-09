package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;//driver is an object of global entity webdriver
	
	 public void initializeBrowser()
	   {
		   driver=new ChromeDriver();//Chromedriver is a predefined class
		   		driver.get("https://selenium.qabible.in");  //get is the method used to launch url
		   		//driver.manage().window().minimize();
	   }
	 public void driverCloseandQuit()
	 {
		// driver.quit();
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we have to call the method here
		Base base=new Base();//give same name as class
		base.initializeBrowser();//calling the method
        base.driverCloseandQuit();
	}
  
}
