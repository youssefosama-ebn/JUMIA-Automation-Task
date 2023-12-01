package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BakeriesPage  extends PageBase

{
	public BakeriesPage(WebDriver driver)
	{
		
		super(driver);
		
	}
	
	 
	WebElement lino=driver.findElement(By.xpath("//a[@href='/lino-oat-muffin-vanilla-350-g-38719210.html']"));
	
	WebElement addtocart=driver.findElement(By.xpath("//form[@action='/cart/products/LI050FF00ROQVNAFAMZ-61594985/quantity/']"));
	
	@FindBy (xpath = "//a[@href='/mr.-food-bread-crumbs-250g-45131612.html']")
	WebElement product2;
	@FindBy(xpath = "//form[@action='/cart/products/MR848FF0CV8TENAFAMZ-70077891/quantity/']")
	WebElement addtocart2;
	@FindBy (css =".-df.-i-ctr.-gy9.-hov-or5.-phs.-fs16")
	WebElement ADDTOCART;
	
	public void click() throws InterruptedException
	{
		scrolluntil(lino);

		hover(lino);
		addtocart.click();
		Thread.sleep(2000);
		scrolluntil(product2);
		hover(product2);
		addtocart2.click();
		Thread.sleep(5000);
		ADDTOCART.click();
		
		
		
	}
	
	


	
	
	
	

}
