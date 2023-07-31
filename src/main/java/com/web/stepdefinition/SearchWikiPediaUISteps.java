package com.web.stepdefinition;

import org.junit.Assert;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.web.config.WebConst;
import com.web.pageObjectFactory.MainPage;
import com.web.pageObjectFactory.SearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchWikiPediaUISteps {
//	private TestContext context;
//	private static final Logger LOG = LogManager.getLogger(SearchWikiPediaUISteps.class);
	WebDriver driver = null;
	MainPage mainPage;
	SearchPage searchPage;

	@Given("I launch WikiPedia main page")
	public void i_launch_wiki_pedia_main_page() {
		System.out.println("=========Start i_launch_wiki_pedia_main_page...");
		System.setProperty("webdriver.chrome.driver", WebConst.CHROME_DRIVER_PATH);
		ChromeOptions options = new ChromeOptions(); // solve err on Chrome 111+: WARNING: Invalid Status code=403
														// text=Forbidden
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(WebConst.PAGE_LOAD_TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WebConst.IMPLICIT_WAIT));
		driver.get("https://en.wikipedia.org/wiki/Main_Page");

		mainPage = new MainPage(driver);
	}

	@When("I search by keyword {string}")
	public void i_search_by_keyword(String searchKey) {
		System.out.println("=========Start i_search_by_keyword: " + searchKey);
		mainPage.enterSearchKey(searchKey);
	}

	@When("I click on Search for pages containing item from the suggestion dropdown-list")
	public void i_click_on_search_for_pages_containing_item_from_the_suggestion_dropdown_list() {
		System.out.println(
				"=========Start i_click_on_search_for_pages_containing_item_from_the_suggestion_dropdown_list...");
		mainPage.clickSearchForPagesContainingItem();
	}

	@When("I click on Search button")
	public void i_click_on_search_button() {
		System.out.println("=========Start i_click_on_search_button...");
	}

	@Then("I see keyword {string} is populated at Search Box")
	public void i_see_keyword_is_populated_at_search_box(String expSearchKey) {
		System.out.println("=========Start i_see_keyword_is_populated_at_search_box...");
		searchPage = new SearchPage(driver);
		String actSearchKeyDisplayed = searchPage.getTextOnSearchBox();
		Assert.assertEquals(actSearchKeyDisplayed,expSearchKey);
		
	}
	
	@When("I close browser")
	public void i_close_browser() {
		System.out.println("=========Start closeBrowser...");
		driver.close();
	}
}
