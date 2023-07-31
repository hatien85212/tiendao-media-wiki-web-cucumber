package com.web.pageObjectFactory;

import static com.web.base.SeleniumDriver.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web.base.BaseObjectPage;
import com.web.base.BasePage;
import com.web.base.PageLoadHelper;

public class SearchPage extends BasePage{
	@FindBy(xpath = "//input[@title='Search Wikipedia']")
	private WebElement txtSearchBox2;

	@FindBy(name = "password")
	private WebElement btnSearch;

	public SearchPage(WebDriver driver) {
		super(driver);
	}
	public String getTextOnSearchBox() {
		log.info("========== Start getTextOnSearchBox... ==========");
		return txtSearchBox2.getAttribute("value");
	}
//	@Override
//	public String getPageUrl() {
//		return "/MainPage";
//	}

//	public SearchPage open() {
//		return new SearchPage().openPage(SearchPage.class);
//	}

//	@Override
//	protected void load() {
//
//	}

//	@Override
//	protected void isLoaded() throws Error {
////		PageLoadHelper.isLoaded().isElementIsVisible(By.cssSelector(".login-form"));
////		PageLoadHelper.isLoaded().waitForPageLoaded();
//	}
}
