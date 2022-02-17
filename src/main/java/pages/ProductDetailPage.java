package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProductDetailPage extends PageBase {

	public ProductDetailPage(WebDriver driver) {
		super(driver);
		jes=(JavascriptExecutor) driver;
		  
	}

	// product_sort_container
	Select sort_container=new Select(driver.findElement(By.cssSelector("select.product_sort_container")));

	//the products locators
	public By Btn_AddToCart=By.id("add-to-cart-sauce-labs-onesie");

	public void Sort_Products_From_Low_To_High(String text) 
	{
		sort_container.selectByVisibleText(text);
		//sort_container.selectByIndex(2);
	}
	public void Add_product_to_cart() 
	{
	clickButton(Btn_AddToCart);
	}
}
