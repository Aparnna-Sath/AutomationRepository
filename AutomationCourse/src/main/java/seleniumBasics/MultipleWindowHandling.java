package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends Base {
    
    public void multipleWindowHandling() {
        driver.navigate().to("https://demo.guru99.com/popup.php");
        String parentWindowHandleID = driver.getWindowHandle();
        System.out.println(parentWindowHandleID);
        
        WebElement clickheretext = driver.findElement(By.xpath("//a[text()='Click Here']"));
        clickheretext.click();
        
        Set<String> handleIDs = driver.getWindowHandles();
        System.out.println(handleIDs);
        
        Iterator<String>values = handleIDs.iterator();
        while (values.hasNext()) 
        {
            String current_id = values.next();
            if (!current_id.equals(parentWindowHandleID)) {
                driver.switchTo().window(current_id);
                
                WebElement email_fld = driver.findElement(By.xpath("//input[@name='emailid']"));
                email_fld.sendKeys("abc@gmail.com");
                
                WebElement submit_fld = driver.findElement(By.xpath("//input[@name='btnLogin']"));
                submit_fld.click();
                
                driver.close(); // Close the new window before switching back
                driver.switchTo().window(parentWindowHandleID); // Switch back to parent window
            }
        }
    }

    public static void main(String[] args) {
        MultipleWindowHandling window = new MultipleWindowHandling();
        window.initializeBrowser();
        window.multipleWindowHandling();
        window.driver.quit(); // Ensure driver quits properly
    }
}
