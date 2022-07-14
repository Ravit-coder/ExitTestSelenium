package SeleniumExitTestAssignmentMaven.Pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	
	public LoginPage(WebDriver driver)  {
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using="//button[contains(text(),'✕')]")  // class =  _2KpZ6l _2doB4z
	public WebElement pop;

	@FindBy(how = How.XPATH, using="//span[contains(text(),'Enter Email/Mobile number')]/../..//input")
	public WebElement email;
	
	@FindBy(how = How.XPATH, using="//span[contains(text(),'Enter Password')]/../..//input")
	public WebElement pass;
	
	@FindBy( how = How.XPATH, using = "//span[contains(text(),'Login')]/../..//button")
	public WebElement signin;
	
	public void popup()
	{
		pop.click();
	}
	
	public void emailup(String usernm)
	{
		email.sendKeys(usernm);
	}
	
	public void passup(String passw)
	{
		pass.sendKeys(passw);
	}
	
	public void sign()
	{
		signin.click();
	}

	
}
