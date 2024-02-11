Feature: feature is to test google search functionality

  Scenario: validate google search is working
    Given user launch chrome browser
    And user opens google search
    When user enter a text in search box
    And hits enter
    When close the browser
