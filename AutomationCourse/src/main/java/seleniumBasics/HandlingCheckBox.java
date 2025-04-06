package seleniumBasics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

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
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
				fluentWait.until(ExpectedConditions.elementToBeClickable(radiobutton));
		radiobutton.click();
		System.out.println(radiobutton.isSelected());
		
	}
	

}
