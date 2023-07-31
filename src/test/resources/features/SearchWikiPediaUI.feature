#Author: hatien85212@gmail.com
#Date: 30-Jul-2023
#Description: Verify search page

@wikiPedia @search
Feature: To search WikiPedia

  @WP_001 @regression
  Scenario: Verify populating search key at Search page by default
    Given I launch WikiPedia main page
  	When I search by keyword "Software Testing"
    And I click on Search for pages containing item from the suggestion dropdown-list
    Then I see keyword "Software Testing" is populated at Search Box 
    And I close browser