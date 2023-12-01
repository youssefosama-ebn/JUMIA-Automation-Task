package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import data.JsonDataReaderRegister;
import pages.HomePage;
import pages.RegisterPage;

public class registerTCs  extends testbase
{
	HomePage hp;
	RegisterPage rp;
	
	@Test
	public void New_RegisterTCs() throws InterruptedException, FileNotFoundException, IOException, ParseException
	{
		JsonDataReaderRegister jsonreader=new JsonDataReaderRegister();
		jsonreader.JsonReader();
		hp=new HomePage(driver);
		hp.navigate_to_signin();
		rp=new RegisterPage(driver);
		rp.registerform(jsonreader.mobilenumber,jsonreader.password,jsonreader.confirmpassword,jsonreader.firstname,jsonreader.lastname,jsonreader.email,jsonreader.date,jsonreader.otp);
		
	}
	

}
