package steps;

import static org.testng.Assert.assertEquals;

//import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RegisterPage;
import tests.registerTCs;
import tests.testbase;

public class UserRegiserTCs extends testbase
{
	HomePage hp;
	RegisterPage rp;
	@Given("the user in the home page and click on sign in link to register")
	public void the_user_in_the_home_page_and_click_on_sign_in_link_to_register() {
	    hp=new HomePage(driver);
	    hp.navigate_to_signin_toRegister();
		
	
	}
	@When("the user enter {string} ,{string},{string},{string},{string},{string},{string},{string}")
	public void the_user_enter(String mobilenumber, String password, String confirmapassword, String firstname, String lastname, String email, String date, String otp) throws InterruptedException 
	{
		rp=new RegisterPage(driver);
		rp.registerform(mobilenumber, password, confirmapassword, firstname, lastname, email, date, otp);

	
		
	}
	@Then("user registered successfully")
	public void user_registered_successfully()
		{
		  assertEquals(driver.getCurrentUrl(),"https://www.jumia.com.eg/");
		
		
		
		
	   	}

	
	

}
