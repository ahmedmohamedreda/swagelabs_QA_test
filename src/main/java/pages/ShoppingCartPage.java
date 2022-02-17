package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingCartPage extends PageBase  {

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
		jes=(JavascriptExecutor) driver;
		 wait = new WebDriverWait(driver, 10);

	}

	By Cart_Icon=By.id("shopping_cart_container");

	public By Ordersuccessfullyprocessed_Txt=By.cssSelector("div.title");
	By btn_checkout=By.id("checkout");

	public void Open_Shopping_Cart_Page()
	{
		clickButton(Cart_Icon);
	}
	public void Checkout_The_Order() 
	{

		clickButton(btn_checkout);
	}
}
