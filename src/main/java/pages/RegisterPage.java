package pages;


import java.util.stream.StreamSupport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.verify.v2.Service;

public class RegisterPage extends PageBase
{
	
	  public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	  
	  @FindBy(id = "input_identifierValue")
		WebElement mobilenumber;
		@FindBy(xpath = "//button[@type='submit']//span[@class='mdc-button__touch']")
		WebElement continuebtn;
		@FindBy(xpath ="//input[@name='password']")
		WebElement Password;
		@FindBy (xpath ="//input[@class='mdc-text-field__input confirm-password-input']" )
		WebElement confirmpassword;
		@FindBy (xpath = "//button[@class='mdc-button mdc-button--touch mdc-button--raised to-personal-details mdc-ripple-upgraded']//span[@class='mdc-button__touch']")
		WebElement continu2;
		@FindBy (id = "input_first_name")
		WebElement firstname;
		@FindBy (id="input_last_name")
		WebElement lastname;
		@FindBy (xpath = "//input[@name='email']")
		WebElement email;
		@FindBy (xpath = "//button[@class='mdc-button mdc-button--touch mdc-button--raised to-personal-details-part-2 mdc-ripple-upgraded']//span[@class='mdc-button__touch']")
		WebElement continue3;
		@FindBy (xpath ="//div[@class='mdc-select__anchor']")
		WebElement gendreDDL;
		@FindBy(xpath="//li[@data-value='M']")
		WebElement maleValue;
		@FindBy(id = "input_birth_date")
		WebElement birhtdate;
		@FindBy (id="acceptTC")
		WebElement acceptTCCheckBOX;
		@FindBy (id="confirmBtn")
		WebElement confirmBTN;
		@FindBy(xpath = "//input[@aria-label='digit 1']")
		WebElement OTP;
		

	//public static final String ACCOUNT_SID ="ACc4917d0a54c878c29d9c6edff443504f";
	//public static final String AUTH_TOKEN ="a10dc74d2c6ee19ee19c9d7f5cbe9d73";
	
	
	public void registerform(String mobilenumber,String pass,String confirmpass,String firsrn,String lastn,String email,String date,String otp) throws InterruptedException
	{
		this.mobilenumber.click();
		this.mobilenumber.sendKeys(mobilenumber);
		this.continuebtn.click();
		Thread.sleep(2000);
		this.Password.click();
		this.Password.sendKeys(pass);
		this.confirmpassword.click();
		this.confirmpassword.sendKeys(confirmpass);
		Thread.sleep(2000);
		this.continu2.click();
		Thread.sleep(2000);
		this.firstname.click();
		this.firstname.sendKeys(firsrn);
		this.lastname.click();
		this.lastname.sendKeys(lastn);
		this.email.click();
		this.email.sendKeys(email);
		Thread.sleep(2000);
		this.continue3.click();
		Thread.sleep(2000);
		this.gendreDDL.click();
		this.maleValue.click();
		this.birhtdate.click();
		this.birhtdate.sendKeys(date);
		this.acceptTCCheckBOX.click();
		this.confirmBTN.click();
		Thread.sleep(2000);
		this.OTP.click();
		this.OTP.sendKeys(otp);
		driver.navigate().to("https://www.jumia.com.eg/");
		
	}
	
	
	/*
	 * public static void main(String[] args) { Twilio.init(ACCOUNT_SID,
	 * AUTH_TOKEN); Optional<String> smsBody = getMessage();
	 * System.out.println(smsBody); }
	 * 
	 * public static Optional<String> getMessage() { return getMessages().filter(m
	 * -> m.getDirection().compareTo(Message.Direction.INBOUND)== 0) .filter(m ->
	 * m.getTo().equals("+201004816047")).map(Message::getBody).findFirst(); }
	 * public static Stream<Message> getMessages(){ ResourceSet<Message> messages =
	 * Message.reader(ACCOUNT_SID).read(); return
	 * StreamSupport.stream(messages.spliterator(), false); }
	 */
}
