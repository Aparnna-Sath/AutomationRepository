package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingCheckBox extends Base

{

	public static void main(String[] args) 
	
	{
		HandlingCheckBox checkbox=new HandlingCheckBox();
		checkbox.initializeBrowser();
		checkbox.handlingCheckbox();
		checkbox.handlingRadioButtons();
		// TODO Auto-generated method stub

	}

	private void handlingCheckbox() 
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkbox1=driver.findElement(By.xpath("//input[@value='option-1']"));
		checkbox1.click();
		System.out.println(checkbox1.isSelected());
		
		// TODO Auto-generated method stub
		
	}
	
	public void handlingRadioButtons()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radiobutton=driver.findElement(By.xpath("//input[@value='green']"));
		radiobutton.click();
		System.out.println(radiobutton.isSelected());
		
	}
	

}
