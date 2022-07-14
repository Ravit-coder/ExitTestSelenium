#Flipkart Website Automation Suite Information:-
* [FlipKart](https://www.flipkart.com/)

##### To run the Flipkart Automation Suite from command line in project folder

* **mvn clean test**

### TestNG file description

* TestNG.xml - defines the all test related

###Packages description

* **SeleniumExitTestAssignmentMaven.Pages :** Defines all the pages actions and the respective object repository

* **Test.SeleniumExitTestAssignmentMaven :** Defines all the pages tests and assertions.

* **utils :** Defines all the utilities for the tests

### Headless Mode

* **There are Option to run in Headless Mode by writing headless in config properties file**

##Tests.Java files description

* **BaseTest :-** The main class which defines - @BeforeMethod - to open the browser and get the URL - @AfterMethod -logger and to quit the browser - @BeforeSuite - to implement extent report - @AfterSuite - to impliment to close the extent report

* **LoginTest :-** Includes Test - to verify the login with valid credentials - to verify the login with invalid credentials

* **SearchTest :-** Includes Test - to verify the valid search product - to verify the invalid search product

* **AddCartTest :-** Includes Test - to verify the add card product functionality

* **CareersTest :-** Includes Test - to verify the current jobs available for various posts

* **GroceryTest :-** Includes Test - to verify the valid product showing in grocery shop

* **GiftsCardTest :-** Includes Test - to verify the gift card

* **OrdersTest :-** Includes Test - to verify the allready order placed 

* **SocialMediaTest :-** Includes Test - to verify the facebook funtionality - to verify the youtube funtinality

* **CustomerCareTest :-** Includes Test - to verify the customer service &  service help

###Other files description

* **Screenshot.java :** Defines function to take screenshot

* **Resources :** Read the properties and common global test data from config.properties & **Log4j2** logger used to implemented logging from log4j2.properties

* **excel :** Read all the test data from data excel file

* **Reports :** show the report from extentReport.html

* **FailedScreenshot :** failed screenshot are placed in failedscreenshot

* **Drivers :** Defines all the driver (Chrome, Firefox, Interner explorer)

## Integrated Test Suite with jenkins and Github

* [GitHub](https://github.com/Ravit-coder/ExitTestSelenium.git)

* [jenkins](http://localhost:8080/job/Selenium%20Test/)

###Reports & Screenshots
* Extent Report gets generated after the run under Reports\ExtentReport.html
* Screenshots gets placed under \FailedScreenshot folder with testname



