package seleniumBasics;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;


public class WebElementCommands extends Base {

    public static void main(String[] args) {
        WebElementCommands webelement = new WebElementCommands();
        webelement.initializeBrowser();
        webelement.handlingWebElementCommands();
    }

    private void handlingWebElementCommands() {
        driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
        
        // Corrected XPath syntax
        WebElement messagefield = driver.findElement(By.xpath("//input[@id='single-input-field']"));
        
        messagefield.sendKeys("Aparnna");
        
        // Printing tag name correctly
        //System.out.println(messagefield.getTagName());
        WebElement showMessagebutton = driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessagebutton.click();
		messagefield.clear();
		System.out.println(showMessagebutton.getCssValue("background-color"));
		System.out.println(messagefield.getTagName());
    }
}
