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
	public static File file;
	public static Properties prop;
	public static FileInputStream fis;


	static {
		
		try {
			file = new File("./Resources/config.properties");
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	prop = new Properties();
	try {
		prop.load(fis);
	} catch (IOException e) {
		e.printStackTrace();
	}

	}

	
	public LoginPage(WebDriver driver)  {
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using="//button[contains(text(),'✕')]")  //  _2KpZ6l _2doB4z
	public WebElement pop;
	
	@FindBy(how = How.CLASS_NAME, using="_2IX_2- VJZDxU")
	public WebElement email;

	@FindBy(how = How.XPATH, using="//span[contains(text(),'Enter Email/Mobile number')]/../..//input")
	public WebElement emaill;
	
	@FindBy(how = How.XPATH, using="//span[contains(text(),'Enter Password')]/../..//input")
	public WebElement pass;
	
	@FindBy( how = How.XPATH, using = "//span[contains(text(),'Login')]/../..//button")
	public WebElement signin;
	
	public void popup()
	{
		pop.click();
	}
	
	public void emailup()
	{
		emaill.sendKeys("7982967187");
	}
	
	public void passup()
	{
		pass.sendKeys("dontimagine");
	}
	
	public void invalidpassup()
	{
	   pass.sendKeys("sjmabcdhjbd");	
	}
	
	public void sign()
	{
		signin.click();;
	}
	
}
