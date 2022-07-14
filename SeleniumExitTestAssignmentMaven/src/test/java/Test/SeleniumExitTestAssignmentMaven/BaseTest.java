package Test.SeleniumExitTestAssignmentMaven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utils.Screenshot;

public class BaseTest {
	static WebDriver driver;
	public static File file;
	public static Properties prop;
	public static FileInputStream fis;
	public static ExtentReports extent;
	public static ExtentTest extentTest;

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

	static {

		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "./Resources/log4j2.properties";

		Configurator.initialize(null, log4jConfigFile);
	}

	public static Logger log = LogManager.getLogger(BaseTest.class);   // logger

	@BeforeSuite
	public void setExtent() {
		extent = new ExtentReports("./Reports/ExtentReport.html");
	}

	@AfterSuite
	public void endReport() {
		extent.flush();
		extent.close();
	}

	@BeforeMethod
	public static void intializeDriver() {

		switch (prop.getProperty("Browser")) {
		case "Chrome":
			System.setProperty(prop.getProperty("ChromedriverProperty"), prop.getProperty("ChromedriverPath"));

			if (prop.getProperty("mode").equals("headless")) {   
				ChromeOptions option = new ChromeOptions();    // option to run headless mode
				option.addArguments("window-size=1400,800");
				option.addArguments("--headless");
				driver = new ChromeDriver(option);  
				driver.manage().window().maximize();
				break;
			} else {
				driver = new ChromeDriver();       // chrome launch
				driver.manage().window().maximize();
				break;
			}

		case "Firefox":
			System.setProperty(prop.getProperty("FirefoxDriverProperty"), prop.getProperty("FirefoxDriverPath"));

			if (prop.getProperty("mode").equals("headless")) {
				FirefoxOptions option = new FirefoxOptions();
				option.setHeadless(true);
				driver = new FirefoxDriver(option);   // firefox launch
				driver.manage().window().maximize();
				break;

			} else {
				driver = new FirefoxDriver(); // launch firefox
				driver.manage().window().maximize();
				break;
			}

		case "InternetExplorer":
			System.setProperty(prop.getProperty("IEdriverProperty"), prop.getProperty("IEdriverPath"));
			driver = new InternetExplorerDriver(); // launch IE
			break;

		default:
			System.out.println("not browser found");
		}
	}

	@BeforeMethod
	public static void openUrl() {
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	}

	@BeforeMethod
	public void startTest(Method name) {
		String testname = name.getName();
		extentTest = extent.startTest(testname);
	}

	@AfterMethod
	public void resultTest(ITestResult result) throws IOException {

		if (result.getStatus() == ITestResult.FAILURE) {
			String imagePath = Screenshot.captureScreenshot(driver, result.getName());
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(imagePath), "Test Failed " + result.getName());
			extentTest.log(LogStatus.FAIL, "Test case failed" + result.getName());
			extent.endTest(extentTest);

		} else if (result.getStatus() == ITestResult.SKIP) {
			extentTest.log(LogStatus.SKIP, result.getThrowable());
			extent.endTest(extentTest);
		} else {
			if (result.getStatus() == ITestResult.SUCCESS)
				extentTest.log(LogStatus.PASS, "Test case passed successfully " + result.getName());
			extent.endTest(extentTest);

		}
		extent.endTest(extentTest);
	}

	@AfterMethod
	public static void testclose() throws IOException {

		driver.close();
	}

}
