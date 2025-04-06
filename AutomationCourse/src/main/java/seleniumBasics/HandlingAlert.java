package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlert extends Base {

    public void handlingSimpleAlert() {
        driver.navigate().to("http://demoqa.com/alerts");
        WebElement clickme1 = driver.findElement(By.id("alertButton"));
        clickme1.click();
        Alert alertRef = driver.switchTo().alert();
        alertRef.accept();
    }

    public void handlingConfirmAlert() {
        driver.navigate().to("http://demoqa.com/alerts");
        WebElement clickme2 = driver.findElement(By.id("confirmButton"));
        clickme2.click();
        Alert alertRef1 = driver.switchTo().alert();
        alertRef1.accept();
        
    }

    public void prompAlert() {
        driver.navigate().to("http://demoqa.com/alerts");
        WebElement clickme3 = driver.findElement(By.id("promtButton")); // Fixed: Changed "promtButton" to "promptButton"
        clickme3.click();
        Alert alertRef2 = driver.switchTo().alert();
        alertRef2.sendKeys("Sent Text");
        
        alertRef2.accept();
    }

    public static void main(String[] args) {
        HandlingAlert alert = new HandlingAlert();
        alert.initializeBrowser();
        //alert.handlingSimpleAlert();
        alert.handlingConfirmAlert();
        //alert.prompAlert();
        // alert.driverCloseandQuit();
    }
}
