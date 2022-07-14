package Test.SeleniumExitTestAssignmentMaven;

import org.testng.annotations.Test;

import SeleniumExitTestAssignmentMaven.Pages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test
	public void valid_login() throws InterruptedException {
    log.info("*******************************************Login Funtionality************************************************");
	LoginPage pg = new LoginPage(driver);
   //      pg.popup();
         pg.emailup();
         pg.passup();
         pg.sign();
         Thread.sleep(5000);
        
	}	
	
	@Test
	public void invalid_login() throws InterruptedException
	{
		LoginPage pg = new LoginPage(driver);
		 pg.emailup();
         pg.invalidpassup();
         pg.sign();
         Thread.sleep(5000);
	}
}
