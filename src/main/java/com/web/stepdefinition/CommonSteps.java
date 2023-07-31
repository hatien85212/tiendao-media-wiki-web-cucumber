package com.web.stepdefinition;

import static org.junit.Assert.*;

import java.time.Duration;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.web.base.BaseTest;
import com.web.config.WebConst;
import com.web.pageObjectFactory.MainPage;
import com.web.pageObjectFactory.SearchPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;

public class CommonSteps extends BaseTest{
	WebDriver driver = null; 
	MainPage mainPage;
	SearchPage searchPage;
	
//	private TestContext context;
//	private static final Logger LOG = LogManager.getLogger(CommonSteps.class);

//	public CommonSteps(TestContext context) {
//		this.context = context;
//	}
//
//	@Given("I launch WikiPedia page")
//	public void launchWikiPediaPage() {
//		System.out.println("========== Start launchWikiPediaPage: =========");
//		
//		System.setProperty("webdriver.chrome.driver",WebConst.CHROME_DRIVER_PATH);
//		ChromeOptions options = new ChromeOptions(); // solve err on Chrome 111+:  WARNING: Invalid Status code=403 text=Forbidden
//		options.addArguments("--remote-allow-origins=*");
//		driver = new ChromeDriver(options);
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(WebConst.PAGE_LOAD_TIMEOUT));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WebConst.IMPLICIT_WAIT));
//		driver.get("https://en.wikipedia.org/wiki/Main_Page");
//		
//		mainPage = new MainPage(driver);
//	}
//	@When("I close browser")
//	public void closeBrowser() {
//		System.out.println("========== Start closeBrowser: =========");
//		driver.close();
//	}
//	
//	@When("I enter the search string \'(.*)\'")
//	public void enterSearchString(String searchKey) {
//		System.out.println("========== Start enterSearchString: =========");
//		mainPage.enterSearchKey(searchKey);
//	}
//	
//	@When("I click on Search button")
//	public void clickOnSearchButton() {
//		System.out.println("========== Start clickOnSearchButton: =========");
//		mainPage.clickSearch();
//	}
}
