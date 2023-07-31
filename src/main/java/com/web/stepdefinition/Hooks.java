package com.web.stepdefinition;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks {

	private static final Logger LOG = LogManager.getLogger(Hooks.class);
	
	@Before
	public void testStart(Scenario scenario) {
		LOG.info("*****************************************************************************************");
		LOG.info(" Start Scenario: "+scenario.getName());
		LOG.info("*****************************************************************************************");
	}
	
	@After
	public void endStart(Scenario scenario) {
		LOG.info("*****************************************************************************************");
		
		LOG.info("	End Scenario: "+scenario.getName());
		LOG.info("*****************************************************************************************");
	}
}
