package com.web.base;

import static com.web.base.SeleniumDriver.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * Created by Sargis Sargyan on 4/22/18.
 */

public class PageLoadHelper {
    public static PageLoadHelper isLoaded() {
        PageLoadHelper loadHelper = new PageLoadHelper();
        return loadHelper;
    }

//
//    public PageLoadHelper isElementIsClickable(By by) {
//        try {
//            new WebDriverWait(getDriver(), 10).until(ExpectedConditions.elementToBeClickable(by));
//            return this;
//        } catch (WebDriverException e) {
//            throw new Error("Element is not clickable");
//        }
//    }
//
//    public PageLoadHelper isElementIsVisible(By by) {
//        try {
//            new WebDriverWait(getDriver(), 10).until(ExpectedConditions.visibilityOfElementLocated(by));
//            return this;
//        } catch (WebDriverException e) {
//            throw new Error("Element is not visible");
//        }
//    }
//
//    public PageLoadHelper isElementIsInvisible(By by) {
//        try {
//            new WebDriverWait(getDriver(), 10).until(ExpectedConditions.visibilityOfElementLocated(by));
//            new WebDriverWait(getDriver(), 10).until(ExpectedConditions.invisibilityOfElementLocated(by));
//            return this;
//        } catch (WebDriverException e) {
//            throw new Error("Element is not visible");
//        }
//    }
//
//    public PageLoadHelper isElementIsVisible(WebElement element) {
//        try {
//            new WebDriverWait(getDriver(), 10).until(ExpectedConditions.visibilityOf(element));
//            return this;
//        } catch (WebDriverException e) {
//            throw new Error("Element is not visible");
//        }
//    }
//
//    public void waitForPageLoaded(WebDriver driver) {
//        ExpectedCondition<Boolean> expectation = driver ->
//            ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
//        try {
//            Thread.sleep(1000);
//            WebDriverWait wait = new WebDriverWait(driver, 30);
//            wait.until(expectation);
//        } catch (Throwable error) {
//            Assert.fail("Timeout waiting for Page Load Request to complete.");
//        }
//    }
}
