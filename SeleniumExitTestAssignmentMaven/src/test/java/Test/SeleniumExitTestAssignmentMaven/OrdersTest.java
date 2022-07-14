package Test.SeleniumExitTestAssignmentMaven;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import SeleniumExitTestAssignmentMaven.Pages.OrdersPage;
import utils.ExcelDataProvider;

public class OrdersTest extends BaseTest{

	@Test(priority=9,alwaysRun = true,dataProvider = "test5data",dataProviderClass=ExcelDataProvider.class)
	public void orders_placed_history(String username, String password) throws InterruptedException
	{
		log.info("****************************************Orders Futionality***********************************************");
		OrdersPage op = new OrdersPage(driver);
	//	op.pop_up();
		op.emailup(username);
		op.passup(password);
		op.sign();
		Thread.sleep(5000);
	//	op.click_login();
		op.click_flipkart();
		op.click_orders();
		op.click_allready_ordered();
		SoftAssert sa = new SoftAssert();       // assertion
		sa.assertEquals(driver.getTitle(),"Job Openings"); 
	 	System.out.println("Test Pass successfully");
		sa.assertAll();
	}
}
