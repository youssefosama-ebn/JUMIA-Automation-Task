package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage extends PageBase
{

	public AddToCartPage(WebDriver driver)
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy (xpath = "//h3[normalize-space()='Lino Oat Muffin Vanilla - 350 G']")
	WebElement firstproduct;
	@FindBy(xpath = "//h3[normalize-space()='Mr. Food Bread Crumbs - 250g']")
	WebElement SecondProduct;
	@FindBy(xpath ="//a[@href='/lino-oat-muffin-vanilla-350-g-38719210.html']")
	WebElement firstelement;
	WebElement price1=firstelement.findElement(By.xpath("//div[@class='prc']"));
	//@FindBy(xpath = "//a[@href='/mr.-food-bread-crumbs-250g-45131612.html']")
	//WebElement secondelement;
	//WebElement price2=secondelement.findElement(By.xpath("//div[@class='prc']"));
	@FindBy (xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/article[1]/article[2]/a[1]/div[3]/div[1]")
	WebElement secondddd;
	@FindBy(xpath = "//p[@class='-fs20 -plm -tar']")
	WebElement totalprice;
	public String text=firstproduct.getText();
	public String text2=SecondProduct.getText();
	//public String text3=price1.getText();
	public String firstproductprice=price1.getText();
	public String[] arrayyytwo=firstproductprice.split(" ");
	public String firstpricee=arrayyytwo[1];
	public float firstpriceee=Float.parseFloat(firstpricee);
	
	public String secondproductprice=secondddd.getText();
	public String[] arraaay=secondproductprice.split(" ");
	public String seconddd=arraaay[1];
	public float secondpriceee=Float.parseFloat(seconddd);
	//public String text4=price2.getText();
	public String text5=totalprice.getText();
	//public String[] first=text3.split(" ");
	//public String FirstAmount=first[1];
	//public float firstamount=Float.parseFloat(FirstAmount);
	//public String[] second=text4.split(" ");
	//public String Secondamount=second[1];
	//public float secondamount=Float.parseFloat(Secondamount);
	public String[] third=text5.split(" ");
	public String thirdamount=third[1];
	public float Totalprice=Float.parseFloat(thirdamount);
	public float plusamounts=firstpriceee+secondpriceee;
	
	
	
	
	
	
	
	
	

}
