package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdowns extends Base
     {
	
	  public static void main(String[] args) 
	{
		  HandlingDropdowns drop=new HandlingDropdowns();
		  drop.initializeBrowser();
		  drop.handlingDropdown();
	}
	
	public void handlingDropdown()
	{
		
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown1=driver.findElement(By.id("dropdowm-menu-1"));
		Select select=new Select(dropdown1);
		//select.selectByIndex(2);
		select.selectByValue("sql");
		//select.selectByVisibleText("c#");
		
		
		
	}

}
