package seleniumBasics;

import org.openqa.selenium.By;

public class Locate extends Base{
	
	public void handlingLocators()
	{
		driver.navigate().to("https://selenium.qabible.in");
		driver.findElement(By.id("single-input-field"));
		driver.findElement(By.className("form-control"));
		driver.findElement(By.tagName("button"));
		driver.findElement(By.name("author"));
		driver.findElement(By.linkText("Checkbox Demo"));
		//driver.findElement(By.partialLinkText("Radio Buttons Demo"))
		driver.findElement(By.cssSelector("button[id=\'button-one\']"));
		//xpath 
		//tagname[@attribute=’value’]--double slash means current node
		driver.findElement(By.xpath("//input[@id='single-input-field']"));
		driver.findElement(By.xpath("//button[@id='button-two']"));
		driver.findElement(By.xpath("//input[@id='value-a']"));
		driver.findElement(By.xpath("//button[text()='Show Message']"));
		driver.findElement(By.xpath("//button[text()='Get Total']"));

		driver.findElement(By.xpath("//button[@id='button-two']"));
		driver.findElement(By.xpath("//button[@type='button' and @id='button-one']"));
		driver.findElement(By.xpath("//button[@type='buttonsecond' and @id='button-one']"));
		//tagname[@attribute=’value’]//axesMethodName::tagnam
		
		driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]//parent::div[@class='card']"));
       
		driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));
		
		
		

//html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input  //absolute xpath..this is an html text
		

	}
	
       public static void main(String[] args) {
		// TODO Auto-generated method stub
               Locate locate=new Locate();
               locate.initializeBrowser();
               locate.handlingLocators();
               locate.driverCloseandQuit();
               
               
	}

}
