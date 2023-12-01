package tests;

import static org.testng.Assert.assertEquals;

import java.security.PublicKey;

import org.testng.annotations.Test;

import pages.AddToCartPage;
import pages.BakeriesPage;
import pages.HomePage;

public class addtocartbakery  extends testbase

{ 	AddToCartPage add;
	//HomePage hp;
	BakeriesPage bp;
	@Test (groups = "addtocartbakery", dependsOnGroups = "NavigateToBakeryPage")
	public void addbakery() throws InterruptedException
	{
		//hp = new HomePage(driver);
		//hp.navigate_to_Bakery2();
		bp=new BakeriesPage(driver);
		bp.click();
		add=new AddToCartPage(driver);
		assertEquals(add.text,"Lino Oat Muffin Vanilla - 350 G");
		assertEquals(add.text2,"Mr. Food Bread Crumbs - 250g");
		assertEquals(add.plusamounts,add.Totalprice);
		
		
		
		
		
		
	}

	

}


