package Test.SeleniumExitTestAssignmentMaven;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import SeleniumExitTestAssignmentMaven.Pages.HomePage;

public class HomeTest extends BaseTest{

	@Test(priority=6,groups= {"sanity"})
	public void verify_home_applience_1() throws InterruptedException
	{
		log.info("*********************************************Home Applience_1 Functionality*****************************************");
		HomePage hp = new HomePage(driver);
		hp.pop_up();
		hp.click_home();
		hp.click_bedroom_furniture();
		SoftAssert sa = new SoftAssert();        // assertion
		sa.assertEquals(driver.getTitle(),"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"); 
	 	System.out.println("Test Pass successfully");
		sa.assertAll();
	}
	
	@Test(priority=7)
	public void verify_home_applience_2()
	{
		log.info("*******************************************Home Applience_2 Funtionality***************************************");
		HomePage hp = new HomePage(driver);
		hp.pop_up();
		hp.click_home();
		hp.click_lightelectric();
		SoftAssert sa = new SoftAssert();      // assertion
		sa.assertEquals(driver.getTitle(),"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"); 
	 	System.out.println("Test Pass successfully");
		sa.assertAll();
	}
}
