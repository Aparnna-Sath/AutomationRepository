
package seleniumBasics;

public class HandlingNavigationCommands extends Base{

	public static void main(String[] args) {
		HandlingNavigationCommands navigate= new HandlingNavigationCommands();
		navigate.initializeBrowser();
		navigate.handlingNavigationCommands();
		navigate.driverCloseandQuit();
	}
	public void handlingNavigationCommands()
	{
		driver.navigate().to("https://www.amazon.in");//navigate to another web page
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}
}