package steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddToCartPage;
import pages.BakeriesPage;
import pages.HomePage;
import pages.LoginPage;
import tests.testbase;

public class addproductstocart extends testbase
{
	HomePage hp;
	LoginPage lp;
	BakeriesPage bp;
	AddToCartPage ap;

	@Given("the user in the home page and click on sign in link")
	public void the_user_in_the_home_page_and_click_on_sign_in_link()
	{
		hp=new HomePage(driver);
		hp.navigate_to_signin();
	}
	@When("the user enter {string} ,{string}")
	public void the_user_enter(String email, String password) throws InterruptedException 
	{
		lp=new LoginPage(driver);
		lp.login(email, password);

	}
	@When("navigate to Bakery page")
	public void navigate_to_bakery_page() throws InterruptedException
	{
		hp.navigate_to_Bakery2();
		bp= new BakeriesPage(driver);
		bp.click();


	}
	@Then("user can add two products in the cart")
	public void user_can_add_two_products_in_the_cart() 
	{
		ap=new AddToCartPage(driver);
		assertEquals(ap.text,"Lino Oat Muffin Vanilla - 350 G");
		assertEquals(ap.text2,"Mr. Food Bread Crumbs - 250g");
		assertEquals(ap.plusamounts,ap.Totalprice);
		
	}


}

