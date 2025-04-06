package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UploadFile extends Base {
    
    public void verifyFileUploadUsingSendKeys() {
        driver.navigate().to("https://demo.guru99.com/test/upload");
        
        WebElement chooseFile = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
        chooseFile.sendKeys("C:\\Users\\Aparnna S\\git\\repository\\AutomationCourse\\src\\main\\resources\\LearnJava.pdf");

        WebElement termsCheckbox = driver.findElement(By.xpath("//input[@id='terms']"));
        termsCheckbox.click();

        WebElement submitButton = driver.findElement(By.xpath("//button[@id='submitbutton']"));
        submitButton.click();
    }
    
    public void verifyFileUploadUsingRobotClass() throws AWTException {  // Fixed method name typo
        driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
        
        WebElement chooseFile = driver.findElement(By.xpath("//a[@id='pickfiles']"));
        chooseFile.click();
        
        StringSelection s = new StringSelection("C:\\Users\\Aparnna S\\git\\repository\\AutomationCourse\\src\\main\\resources\\LearnJava.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null); 
        
        Robot robot = new Robot();
        robot.delay(2500);
        
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);  // Fixed missing key release
    }

    public static void main(String[] args)
    {
    	
    	    try {
    	        UploadFile fileUpload = new UploadFile();
    	        fileUpload.initializeBrowser();
    	        // fileUpload.verifyFileUploadUsingSendKeys();
    	        fileUpload.verifyFileUploadUsingRobotClass();
    	        // fileUpload.driverCloseAndQuit();
    	    } catch (AWTException e) {
    	        e.printStackTrace();  // Print error details
    	    }
    	}

    }

