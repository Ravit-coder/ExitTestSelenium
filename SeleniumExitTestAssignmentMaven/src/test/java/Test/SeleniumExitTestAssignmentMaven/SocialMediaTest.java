package Test.SeleniumExitTestAssignmentMaven;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import SeleniumExitTestAssignmentMaven.Pages.SocialMediaPage;

public class SocialMediaTest extends BaseTest {

	@Test
	public void verify_social_media_facebook()
	{
		log.info("********************************************Social Media Facebook Funtionality**************************************");
		SocialMediaPage sm = new SocialMediaPage(driver);
		sm.pop_up();
		sm.click_facebook();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(),"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"); 
	 	System.out.println("Test Pass successfully");
		sa.assertAll();
	}
	
	@Test
	public void verify_social_media_youtube()
	{
		log.info("****************************************Social Media Youtube Funtionality******************************************");
		SocialMediaPage sm = new SocialMediaPage(driver);
		sm.pop_up();
		sm.click_youtube();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(),"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"); 
	 	System.out.println("Test Pass successfully");
		sa.assertAll();
	}
}
