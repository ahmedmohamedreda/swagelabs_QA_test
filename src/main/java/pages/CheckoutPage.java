package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage extends PageBase {

	public CheckoutPage(WebDriver driver) {
		super(driver);
		jes=(JavascriptExecutor) driver;

		wait = new WebDriverWait(driver,100);

	}

	// Locators CHECKOUT:INFORMATION SCREEN
	By fName_input=By.id("first-name");
	By lName_input=By.id("last-name");
	By ZipCode_input=By.id("postal-code");
	By continue_btn=By.id("continue");

	// Locators CHECKOUT: OVERVIEW
	By cancel_btn=By.id("cancel");
	By finish_btn=By.id("finish");
	
	// Locators CHECKOUT: COMPLETE!
	public By successful_message=By.cssSelector("h2.complete-header");
	
	
	public void Add_data_in_the_screen_and_click_on_continue(String fristname, String lastname,String ZipCode)
	{
		SetTextElement(fName_input, fristname);
		SetTextElement(lName_input, lastname);
		SetTextElement(ZipCode_input, ZipCode);
		clickButton(continue_btn);
	}

	public void finish_the_order()
	{
		clickButton(finish_btn);
	}
}
