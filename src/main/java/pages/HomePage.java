package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends PageBase
{
	public HomePage (WebDriver driver)
	{
		super(driver);
	}
	WebDriverWait wait;
	
	
	@FindBy (xpath ="//button[@aria-label='newsletter_popup_close-cta']//*[name()='svg']" )
	WebElement closePOPUPBTN;
	@FindBy (xpath = "//label[@for='dpdw-login']//*[name()='svg']")
	WebElement AccountTab;
	@FindBy (xpath ="//a[@class='btn _prim -fw _md']" )
	WebElement SigninBTN;
	
		@FindBy (xpath ="//a[@href='/groceries/']")	
		WebElement supermarket;
	   
	@FindBy(xpath ="//a[@href='/breads-bakery/']")
	WebElement Bakery;

	
	public void navigate_to_signin()
	{
		//closePOPUPBTN.click();
		AccountTab.click();
		SigninBTN.click();
		
		
	}
	public void navigate_to_signin_toRegister()
	{
		closePOPUPBTN.click();
		AccountTab.click();
		SigninBTN.click();
		
		
	}
	
	
	public void navigate_to_Bakery1()
	{	closePOPUPBTN.click();
		hover(supermarket);
		Bakery.click();
		
	
	
	}
	
	public void navigate_to_Bakery2() throws InterruptedException
	
	{	    try {
       
         wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(supermarket));
        // Retry the action on the element

    } catch (StaleElementReferenceException e) {
        // Handle the exception
    }
		hover(supermarket);
		Bakery.click();
		
	
	}
	

	
}


	


