package Test.SeleniumExitTestAssignmentMaven;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import SeleniumExitTestAssignmentMaven.Pages.CustomerCarePage;

public class CustomerCareTest extends BaseTest{

	@Test
	public void customer_sevice()
	{
		log.info("***********************************************CustomerCare Functionality************************************** ");
		CustomerCarePage cp = new CustomerCarePage(driver);
		cp.pop_up();
		cp.click_more();
		cp.click_help_center();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(),"Online Shopping India | Buy Mobiles, Electronics, Appliances, Clothing and More Online at Flipkart.com"); 
	 	System.out.println("Test Pass successfully");
		sa.assertAll();
	}
}
