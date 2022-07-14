package SeleniumExitTestAssignmentMaven.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OrdersPage {
WebDriver driver;
	
	public OrdersPage(WebDriver driver)  {
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using="//button[@class='_2KpZ6l _2doB4z']")
	public WebElement popup;
	
	@FindBy(how = How.XPATH, using="//a[text()='Login']")
	public WebElement clklogin;

	@FindBy(how = How.XPATH, using="//span[contains(text(),'Enter Email/Mobile number')]/../..//input")
	public WebElement email;
	
	@FindBy(how = How.XPATH, using="//span[contains(text(),'Enter Password')]/../..//input")
	public WebElement pass;
	
	@FindBy( how = How.XPATH, using = "//span[contains(text(),'Login')]/../..//button")
	public WebElement signin;
	
	@FindBy(how = How.XPATH, using="//div[text()='Flipkart']")
	public WebElement clkfpkrt;
	
	@FindBy(how =How.XPATH, using="//div[text()='Orders']")
	public WebElement clkorder;
	
	@FindBy(how=How.XPATH, using="//span[text()='RUSTIC ART Organic Wild Rose  Concentrat...']")
	public WebElement clkoneorder;
	
	public void pop_up()
	{
		popup.click();
	}
	
	public void click_login()
	{
		clklogin.click();
	}
	
	public void emailup(String user)
	{
		email.sendKeys(user);
	}
	
	public void passup(String passwd)
	{
		pass.sendKeys(passwd);
	}
	
	public void sign()
	{
		signin.click();
	}
	
	public void click_flipkart()
	{
		clkfpkrt.click();
	}
	
	public void click_orders()
	{
		clkorder.click();
	}
	
	public void click_allready_ordered()
	{
		clkoneorder.click();
	}
}
