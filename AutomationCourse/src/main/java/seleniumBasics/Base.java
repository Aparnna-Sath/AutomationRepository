package seleniumBasics; // Declares the package name

import java.time.Duration;

import org.openqa.selenium.WebDriver; // Imports the WebDriver interface from Selenium
import org.openqa.selenium.chrome.ChromeDriver; // Imports the ChromeDriver class to use Chrome browser

public class Base { // Defines the Base class
	
	public WebDriver driver; // Declares a WebDriver object named 'driver' at the class level (global scope)
	
	public void initializeBrowser() { // Method to initialize and launch the browser
		driver = new ChromeDriver(); // Creates an instance of ChromeDriver to open a Chrome browser
		driver.get("https://selenium.qabible.in"); // Opens the specified URL in the browser
		
		// driver.manage().window().minimize(); // This line (commented) would minimize the browser window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void driverCloseandQuit() { // Method to close or quit the browser
		// driver.quit(); // Closes all browser windows and ends the WebDriver session (commented out)
	}
	
	public static void main(String[] args) { // Main method - the entry point of the program
		// TODO Auto-generated method stub (Placeholder for additional functionality)
		
		// Create an instance of the Base class
		Base base = new Base(); // Instantiating the Base class (creating an object)
		
		base.initializeBrowser(); // Calling the method to initialize and open the browser
		base.driverCloseandQuit(); // Calling the method to close the browser (not active due to commented line)
	}
}
