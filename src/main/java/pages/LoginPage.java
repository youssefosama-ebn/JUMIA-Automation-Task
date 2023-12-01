package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase
{
	public LoginPage (WebDriver driver)
	{
		super(driver);
	}
	@FindBy(id ="input_identifierValue")
	WebElement EmailOrMobileTextBox;
	@FindBy(xpath = "//button[@type='submit']//span[@class='mdc-button__touch']")
	WebElement continuebtn;
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	@FindBy(xpath = "//button[@id='loginButton']//span[@class='mdc-button__touch']")
	WebElement loginBTN;
	
	
	public void login(String email,String Password) throws InterruptedException
	{
		EmailOrMobileTextBox.click();
		EmailOrMobileTextBox.sendKeys(email);
		continuebtn.click();
		Thread.sleep(2000);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(2000);
		loginBTN.click();
		
	}
	
	
	
	
	

}
