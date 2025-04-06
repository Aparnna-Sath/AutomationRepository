package seleniumBasics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Utilities.ExcelUtilities;

public class LoginTest extends TestNGBase

{
	@Test(description="verify whetheruser user is able to successfully login with valid credentials",priority=1)
public void verifyWhetherUsercanLoginWithValidcredentials() throws IOException
{
	String usernameValue=ExcelUtilities.getStringdata(0, 0, "LoginPage");
	String passwordValue=ExcelUtilities.getStringdata(0, 1, "LoginPage");
	LoginPage login=new LoginPage(driver);
	login.enterUsernameonUserNameField(usernameValue);
	login.enterPasswordonField(passwordValue);
	login.clickOnLogin();

}
	
	@Test(description="verify whetheruser user is able to login with valid username and invalid password",priority=2)
	public void verifyWhetherUsercanLoginWithInValiduserNameandValidPass() throws IOException
	{
		String usernameValue=ExcelUtilities.getStringdata(1, 0, "LoginPage");
		String passwordValue=ExcelUtilities.getStringdata(1, 1, "LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameonUserNameField(usernameValue);
		login.enterPasswordonField(passwordValue);
		login.clickOnLogin();
	}
	
	@Test(description="verify whetheruser user is able to login with invalid username and valid password",priority=3)
	public void verifyWhetherUsercanLoginWithvalidUserandInValidpass() throws IOException
	{
		String usernameValue=ExcelUtilities.getStringdata(2, 0, "LoginPage");
		String passwordValue=ExcelUtilities.getStringdata(2, 1, "LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameonUserNameField(usernameValue);
		login.enterPasswordonField(passwordValue);
		login.clickOnLogin();
	}
	@Test(description="verify whetheruser user is able to login with invalid username and invalid password",priority=4)
	public void verifyWhetherUsercanLoginWithInValidcredentials() throws IOException
	{
		String usernameValue=ExcelUtilities.getStringdata(3, 0, "LoginPage");
		String passwordValue=ExcelUtilities.getStringdata(3, 1, "LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameonUserNameField(usernameValue);
		login.enterPasswordonField(passwordValue);
		login.clickOnLogin();
	}
}
