package com.web.base;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.web.config.WebConst;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.time.Duration;
import java.util.Set;

/**
 * Created by Sargis Sargyan on 4/22/18.
 */

public class SeleniumDriver {
	private static ThreadLocal<WebDriver> driverThread = new ThreadLocal<>();
	public static void initDriver() {
		String browser = "chrome"; //BaseTest.prop.getProperty("browser");
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", WebConst.CHROME_DRIVER_PATH);
			ChromeOptions options = new ChromeOptions(); // solve err on Chrome 111+: WARNING: Invalid Status code=403

			options.addArguments("--remote-allow-origins=*");
//			options.addArguments("start-fullscreen");
			driverThread.set(new ChromeDriver(options));
		} else if (browser.equals("FF") || browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.browser", WebConst.FF_DRIVER_PATH);
			driverThread.set(new FirefoxDriver());
		}
		
		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(WebConst.PAGE_LOAD_TIMEOUT));
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(WebConst.IMPLICIT_WAIT));
//		return getDriver();
	}

	public static void takeScreenshot(WebDriver webdriver, String fileWithPath) throws Exception {
		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(fileWithPath);
		FileUtils.copyFile(SrcFile, DestFile);
	}

	public static WebDriver getDriver() {
		return driverThread.get();
	}

	public String getInnerHTML() {
		WebElement element = getDriver().findElement(By.id("form-submit"));
		return element.getAttribute("outerHTML");
	}

	public void clickJS(WebElement element) {
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) getDriver();
		javascriptExecutor.executeScript("arguments[0].click();", element);
	}

	public void maximizeWondow() {
		getDriver().manage().window().maximize();
	}

	public WebDriver maximizeWondowChrome() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		return new ChromeDriver(options);
	}

	public void addCookie(String cookieName, String cookieValue) {
		Cookie cookie = new Cookie(cookieName, cookieValue);
		getDriver().manage().addCookie(cookie);
	}

	public Cookie getCookie(String cookieName) {
		return getDriver().manage().getCookieNamed(cookieName);
	}

	public Set<Cookie> getAllCookie() {
		return getDriver().manage().getCookies();
	}

	public void deleteCookie(String cookieName) {
		getDriver().manage().deleteCookieNamed(cookieName);
	}

	public void deleteAllCookie() {
		getDriver().manage().deleteAllCookies();
	}
}
