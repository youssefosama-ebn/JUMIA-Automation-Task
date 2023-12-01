package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import data.JsonDataReaderLogin;
import pages.HomePage;
import pages.LoginPage;

public class loginTC extends testbase
{
	
	HomePage hp;
	LoginPage lp;
	
	
	@Test(groups={"loginTC.logintoJUMIA"})
	public void logintoJUMIA() throws InterruptedException, FileNotFoundException, IOException, ParseException
	{	
		JsonDataReaderLogin JsonReader=new JsonDataReaderLogin();
		JsonReader.JsonReader();
		hp=new HomePage(driver);
		hp.navigate_to_signin();
		lp=new LoginPage(driver);
		lp.login(JsonReader.email,JsonReader.password);
		
		
		
	}

}
