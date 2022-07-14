package SeleniumExitTestAssignmentMaven.Pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCartPage {
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
	
	public AddCartPage(WebDriver driver)  {
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using="//button[@class='_2KpZ6l _2doB4z']")
	public WebElement h;
	
	@FindBy(how = How.CLASS_NAME, using="_3704LK")
	public WebElement srch;
	
	@FindBy(how = How.CLASS_NAME, using="L0Z3Pu")
	public WebElement clk;
	
	@FindBy(how=How.CLASS_NAME, using="_4rR01T")
	public WebElement clickProduct;
	
	@FindBy(how = How.XPATH, using="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']") 
	public WebElement clickAddCartbtn;
	
	public void hh()
	{
		h.click();
	}
	
	public void search(String search)
	{
		srch.sendKeys(search);
	}
	
	public void clk_search()
	{
		clk.click();
	}
	
	public void click_product()
	{
		clickProduct.click();
	}
	
	public void click_addcart_btn()
	{
		clickAddCartbtn.click();
	}
	
	 public static void waitForNewWindowAndSwitchToIt(WebDriver driver) throws InterruptedException {
	        String cHandle = driver.getWindowHandle();
	        String newWindowHandle = null;
	        Set<String> allWindowHandles = driver.getWindowHandles();
	        
	        //Wait for 20 seconds for the new window and throw exception if not found
	        for (int i = 0; i < 20; i++) {
	            if (allWindowHandles.size() > 1) {
	                for (String allHandlers : allWindowHandles) {
	                    if (!allHandlers.equals(cHandle))
	                    	newWindowHandle = allHandlers;
	                }
	                driver.switchTo().window(newWindowHandle);
	                break;
	            } else {
	                Thread.sleep(1000);
	            }
	        }
	        if (cHandle == newWindowHandle) {
	            throw new RuntimeException(
	                    "Time out - No window found");
	        }
	    }

	
}
