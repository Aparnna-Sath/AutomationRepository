package seleniumBasics;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base 
{
	public void handlingFrames()
	{
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement> iFrames=driver.findElements(By.tagName("iframe"));
        System.out.println(iFrames.size());
        WebElement firstframe=driver.findElement(By.id("frame1"));
        driver.switchTo().frame(firstframe);
        WebElement frameText=driver.findElement(By.id("sampleHeading"));
        System.out.println(frameText.getText());
        driver.switchTo().defaultContent();
        System.out.println(driver.getTitle());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingFrames handlingframes=new HandlingFrames();
		handlingframes.initializeBrowser();
		handlingframes.handlingFrames(); 
		
		

	}

}
