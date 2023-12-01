package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase 
{
    protected WebDriver driver ;
    public WebDriverWait wait;
    

    public PageBase (WebDriver driver)
    {
    	this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    
    

	public   void scrolluntil( WebElement element)
    {	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        	 	
    }
    public void hover(WebElement element2)
    {
    	Actions act=new Actions(driver);
    	act.moveToElement(element2).perform();
    }
    
    
    

  

    	


    
    


    
}