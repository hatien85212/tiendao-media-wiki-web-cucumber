package com.web.base;


//import api.HttpClient;
import com.google.gson.JsonParser;
import com.google.gson.JsonObject;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
//import pageobjects.LoginPage;

import static com.web.base.SeleniumDriver.getDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sargis Sargyan on 4/22/18.
 */

public class SeleniumBaseTest {
	protected void login(String username, String password) {
//		String loginResponse = HttpClient.login(username, password);
//		System.out.println("loginResponse: " + loginResponse);
//		JsonObject jObjectt = new JsonParser().parse(loginResponse).getAsJsonObject();
//		System.out.println(jObjectt);
//		System.out.println("auth_token: " + jObjectt.get("auth_token"));
		
//		new LoginPage().open();
//		((JavascriptExecutor) getDriver()).executeScript("window.localStorage.setItem('token','" + jObjectt.get("auth_token") + "');");
//		((JavascriptExecutor) getDriver()).executeScript("window.localStorage.setItem('userInfo','" + loginResponse + "');");

	}

//	@BeforeMethod
//	public void setupBaseMethod() {
//		SeleniumDriver.initDriver();
//		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	}
//
//	@AfterClass
//	public static void tearDownBase() {
//		getDriver().close();
//	}
}
