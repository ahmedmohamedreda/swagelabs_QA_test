package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductDetailPage;
import pages.ShoppingCartPage;

public class ProcessCheckoutTest extends TestBase
{
	// Objects from pages
	LoginPage login;
	ProductDetailPage PDP;
	ShoppingCartPage cart;
	CheckoutPage checkoutObj;

	// info of the user
	String username="standard_user";
	String Password="secret_sauce";
	String SortBy="Price (low to high)";

	//Data information screen
	String fristname="Ahmed ", lastname="Reda", ZipCode="12354";

	@Test(priority = 1)
	public void Login_To_Website_Using_Valid_Data() 
	{
		login= new LoginPage(driver);
		login.LoginForm(username, Password);
		//		home= new LandingPage(driver);
		//		home.HomePage();
		//		assertEquals("Welcome In Call Center Divipay", home.welcomeTitle.findElement(driver).getText());
		//		System.out.println(home.welcomeTitle.findElement(driver).getText());
	}
	@Test(priority = 2)
	public void Sort_lowest_price()  
	{
		PDP=new ProductDetailPage(driver);
		PDP.Sort_Products_From_Low_To_High(SortBy);
	}	
	@Test(priority = 3)
	public void Adding_product_to_cart_and_open_the_cart()  
	{
		cart=new ShoppingCartPage(driver);	
		PDP.Add_product_to_cart();		
		cart.Open_Shopping_Cart_Page();

	}

	@Test(priority = 4)
	public void Add_required_data_in_your_information_screen() 
	{
		checkoutObj=new CheckoutPage(driver);
		cart.Checkout_The_Order();
		checkoutObj.Add_data_in_the_screen_and_click_on_continue(fristname, lastname, ZipCode);

	}
	@SuppressWarnings("static-access")
	@Test(priority = 5)
	public void Complete_checkout_process() 
	{
		checkoutObj.finish_the_order();
		//First Assertion
		Assert.assertTrue(checkoutObj.driver.getCurrentUrl()
				.contains("checkout-complete"));
		//Second Assertion
		Assert.assertEquals("THANK YOU FOR YOUR ORDER",
				checkoutObj.successful_message.findElement(driver).getText());
	}
}

