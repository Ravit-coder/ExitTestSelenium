package Test.SeleniumExitTestAssignmentMaven;

import org.testng.annotations.Test;

import SeleniumExitTestAssignmentMaven.Pages.LoginPage;
import utils.ExcelDataProvider;

public class LoginTest extends BaseTest {

	@Test(groups= {"sanity"},priority = 8, alwaysRun = true, dataProvider = "test2data", dataProviderClass = ExcelDataProvider.class)
	public void valid_login(String username, String password) throws InterruptedException {
		log.info(
				"*******************************************Login Funtionality************************************************");
		LoginPage pg = new LoginPage(driver);
		// pg.popup();
		pg.emailup(username);
		pg.passup(password);
		pg.sign();
		Thread.sleep(5000);

	}

}
