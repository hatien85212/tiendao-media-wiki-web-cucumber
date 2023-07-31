package com.web.base;

import static com.web.base.SeleniumDriver.getDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.web.config.WebConst;
import com.web.utils.WebEventListener;

public class BaseTest {

	public static WebDriver driver;
	public static Properties prop = new Properties();;
	public static EventFiringDecorator eventDriver;
	public static WebEventListener eventListener;
	public static Logger log = Logger.getLogger(BaseTest.class);
	
	public BaseTest() {
		try {
			FileInputStream config = new FileInputStream("src/test/resources/config.properties");
			prop.load(config);
//			String browser = prop.getProperty("browser");
//			log = Logger.getLogger(BaseTest.class);
//			log.info("Run BaseTest" + browser);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@BeforeMethod
	public static void setup() {
		log.info("@BeforeMethod -- Initializing the browser");
		SeleniumDriver.initDriver();
		
//		eventDriver = new EventFiringWebDriver(driver);
//		eventListener = new WebEventListener(); 
//		eventDriver.register(eventListener);
//		driver = eventDriver;

//		 WebDriver original = new FirefoxDriver();
//		   WebDriverListener listener = new MyListener();
//		   WebDriver decorated = new EventFiringDecorator(listener).decorate(original);
//		   decorated.get("http://example.com/")

		// https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/support/events/EventFiringDecorator.html
//		WebEventListener listener = new WebEventListener();// Create instance of Listener Class
//		WebDriver decorated = new EventFiringDecorator(listener).decorate(getDriver());
//		decorated.get("http://example.com/");

//	        decorated =  //decorator.decorate(driver);

		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(WebConst.PAGE_LOAD_TIMEOUT));
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(WebConst.IMPLICIT_WAIT));
	}

	@AfterMethod
	public void tearDown() {
		log.info("@AfterMethod -- close browser");
		getDriver().close();
		getDriver().quit();
	}

	
}
