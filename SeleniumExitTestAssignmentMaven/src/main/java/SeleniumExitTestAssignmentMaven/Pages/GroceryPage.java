package SeleniumExitTestAssignmentMaven.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GroceryPage {
WebDriver driver;
	
	public GroceryPage(WebDriver driver)  {
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using="//button[@class='_2KpZ6l _2doB4z']")
	public WebElement popup;
	
	@FindBy(how = How.XPATH, using="(//img[@class='_396cs4  _3exPp9'])[2]")
	public WebElement clkgrocery;
	
	@FindBy(how = How.NAME, using="q")
	public WebElement searchproduct; 
	
	@FindBy(how = How.XPATH, using="//button[@class='L0Z3Pu']")
	public WebElement clkbtn;
	
	public void pop_up()
	{
		popup.click();
	}
	
	public void click_grocery()
	{
		clkgrocery.click();
	}
	
	public void search_product(String prdt)
	{
		searchproduct.sendKeys(prdt);
	}
	
	public void search_button()
	{
		clkbtn.click();
	}
}
