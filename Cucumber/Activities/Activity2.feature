@Activity2
Feature: Testing Login
  Scenario: Opening a webpage using Selenium
    Given User is on Login page
    When User enters username and password
    Then Read the page title and confirmation message
    And Close the Browser