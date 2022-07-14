package Test.SeleniumExitTestAssignmentMaven;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import SeleniumExitTestAssignmentMaven.Pages.GiftsCardsPage;

public class GiftsCardsTest extends BaseTest{

	@Test
	public void Gifts()
	{
		log.info("**************************************************Gifts Cards Funtinality*********************************");
		GiftsCardsPage gc = new GiftsCardsPage(driver);
		gc.pop_up();
		gc.click_gift_card();
		gc.click_know_more();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(),"Online Shopping India | Buy Mobiles, Electronics, Appliances, Clothing and More Online at Flipkart.com"); 
	 	System.out.println("Test Pass successfully");
		sa.assertAll();
	}
}
