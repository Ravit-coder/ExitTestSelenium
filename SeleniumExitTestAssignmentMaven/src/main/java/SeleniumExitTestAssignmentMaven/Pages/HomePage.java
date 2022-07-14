package SeleniumExitTestAssignmentMaven.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
WebDriver driver;
	
	public HomePage(WebDriver driver)  {
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using="//button[@class='_2KpZ6l _2doB4z']")
	public WebElement popup;
	
	@FindBy(how = How.XPATH, using="//div[text()='Home']")
	public WebElement clkhome;
	
	@FindBy(how =How.XPATH, using="//a[text()='Bedroom Furniture']") 
	public WebElement clkfurniture;
	
	@FindBy(how = How.XPATH, using="//a[text()='Lightings & Electricals']")
	public WebElement clkelectric;
	
	public void pop_up()
	{
		popup.click();
	}
	
	public void click_home()
	{
	Actions action = new Actions(driver);
	action.moveToElement(clkhome).perform();
	}
	
	public void click_bedroom_furniture()
	{
		clkfurniture.click();
	}
	
	public void click_lightelectric()
	{
		clkelectric.click();
	}

	
}
