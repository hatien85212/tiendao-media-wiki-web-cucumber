package com.web.config;

public class WebConst {
	public static int PAGE_LOAD_TIMEOUT = 30;
	public static int IMPLICIT_WAIT = 10;
	public static int EXPLICIT_WAIT = 5;
	public static int EXPLICIT_POLLING = 100;

	private static String DRIVER_PATH = System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\";
	public static String CHROME_DRIVER_PATH = DRIVER_PATH + "chromedriver.exe";
	public static String FF_DRIVER_PATH = DRIVER_PATH + "geckodriver";
	
	public static final String BASE_URL = "https://en.wikipedia.org/wiki/Main_Page";
	public static final String BROWSER = "chrome";
}
