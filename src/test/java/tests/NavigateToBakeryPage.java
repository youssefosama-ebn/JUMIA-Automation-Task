package tests;

import org.testng.annotations.Test;

import pages.HomePage;

public class NavigateToBakeryPage  extends testbase


{
	HomePage hp;
	
	@Test (groups = "NavigateToBakeryPage", dependsOnGroups = "loginTC.logintoJUMIA")
	public void NavigateToBakery() throws InterruptedException
	{
		hp = new HomePage(driver);
		hp.navigate_to_Bakery2();
		
		
	}
	

}
