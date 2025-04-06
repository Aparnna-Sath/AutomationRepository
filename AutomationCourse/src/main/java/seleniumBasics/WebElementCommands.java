package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebElementCommands extends Base {

    public static void main(String[] args) {
        WebElementCommands webelement = new WebElementCommands();
        webelement.initializeBrowser();
        webelement.handlingWebElementCommands();
    }

    private void handlingWebElementCommands() 
    {
        driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
        
        // Corrected XPath syntax
        WebElement messagefield = driver.findElement(By.xpath("//input[@id='single-input-field']"));
        
        messagefield.sendKeys("Aparnna");
        
        // Printing tag name correctly
        //System.out.println(messagefield.getTagName());
        WebElement showMessagebutton = driver.findElement(By.xpath("//button[@id='button-one']"));
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(1000));
        wait.until(ExpectedConditions.elementToBeClickable(showMessagebutton));
		showMessagebutton.click();
		messagefield.clear();
		System.out.println(showMessagebutton.getCssValue("background-color"));
		System.out.println(messagefield.getTagName());
    }
}
