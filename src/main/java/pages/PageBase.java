package pages;





import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {

	public JavascriptExecutor jes;
	public static WebDriver driver;
	public Select select;
	public Actions action;
	public WebDriverWait wait;
	@SuppressWarnings("static-access")
	public PageBase(WebDriver driver) 
	{
		this.driver=driver;
		
	}

	protected static void clickButton(By button) 
	{
		
		driver.findElement(button).click();
		//driver.findElement(button).click();
	}
	protected static void SetTextElement(By textElement,String value) 
	{
		//WebDriver driver = null;
        driver.findElement(textElement).sendKeys(value);
		//textElement.sendKeys(value);
	}
	protected static void clearTextElement(By textElement) 
	{
		//WebDriver driver = null;
        driver.findElement(textElement).clear();
		//textElement.sendKeys(value);
	}
	public void ScrollTOBottom() 
	{
		jes.executeScript("scrollBy(0,2500)");
	}
	
	
	}
