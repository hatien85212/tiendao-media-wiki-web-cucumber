package com.web.pageObjectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web.base.BaseObjectPage;
import com.web.base.BasePage;
import com.web.base.PageLoadHelper;

//import base.BaseObjectPage;
//import setup.PageLoadHelper;
//
//import static com.web.base.SeleniumDriver.getDriver;

public class MainPage extends BasePage{
//	WebDriver driver; 
	@FindBy(name = "search")
	private WebElement txtSearchBox;

	@FindBy(xpath = "//button[contains(.,'Search')]")
	private WebElement btnSearch;
	
	@FindBy(xpath = "(//span[contains(.,'Search for pages containing')])[1]")
	private WebElement itmSearchForPagesContainingItem;

	public MainPage(WebDriver driver) {
		super(driver);
	}

	public void enterSearchKey(String searchKey) {
		txtSearchBox.sendKeys(searchKey);
	}

	public void clickSearchButton() {
		btnSearch.click();
	}

	public SearchPage clickSearchForPagesContainingItem() {
		waitForElementToBeClickable(itmSearchForPagesContainingItem);
		itmSearchForPagesContainingItem.click();
//		PageLoadHelper.isLoaded().isElementIsInvisible(itmSearchForPagesContainingItem);
		return new SearchPage(driver);
	}

//	@Override
//	public String getPageUrl() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	protected void load() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	protected void isLoaded() throws Error {
//		// TODO Auto-generated method stub
//		
//	}
}
