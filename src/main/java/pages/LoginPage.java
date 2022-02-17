package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends PageBase
{

	public LoginPage(WebDriver driver) 
	{
		super(driver);
		wait = new WebDriverWait(driver,80);
	}
	// locators on the login page
	By UserName_input=By.id("user-name");
	By password_input=By.id("password");
	By login_btn=By.id("login-button");
	
	public void LoginForm(String username,String Password)
	{
		SetTextElement(UserName_input, username);
		SetTextElement(password_input, Password);
		//wait.until(ExpectedConditions.textToBePresentInElementValue(password_input, Password));
		clickButton(login_btn);
	}


	
}
