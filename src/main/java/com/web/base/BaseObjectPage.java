package com.web.base;

import static com.web.base.SeleniumDriver.getDriver;
//import static setup.SeleniumDriver.getDriver;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.web.config.WebConst;
//import com.web.base.PageLoadHelper;
import static com.web.base.SeleniumDriver.getDriver;

//import setup.PageLoadHelper;

public abstract class BaseObjectPage<T extends LoadableComponent<T>> extends LoadableComponent<T> {
	private WebDriver driver;
//	private static final Logger LOG = LogManager.getLogger(BaseObjectPage.class);

	public BaseObjectPage(WebDriver driver) {
		this.driver = driver;
	}

	public T openPage(Class<T> clazz) {
		T page = PageFactory.initElements(getDriver(), clazz);
		getDriver().get(WebConst.BASE_URL + getPageUrl());
		return page.get();
	}

	public T init(Class<T> clazz) {
		T page = PageFactory.initElements(getDriver(), clazz);
		return page.get();
	}

	public abstract String getPageUrl();

	public void open(String url) {
		driver.get(url);
	}

	public WebElement find(By locator) {
		return driver.findElement(locator);
	}

	public void type(By inputLocator, String text) {
		find(inputLocator).sendKeys(text);
	}

	public void type(WebElement input, String text) {
		input.sendKeys(text);
	}

	public void click(By locator) {
		find(locator).click();
	}

	public void click(WebElement element) {
		element.click();
	}

	public boolean isElementDisplayed(WebElement element) {
		try {
			return element.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}

//	public WebElement waitForElement(WebElement element) {
//		PageLoadHelper.isLoaded().isElementIsVisible(element);
//		return element;
//	}
}
