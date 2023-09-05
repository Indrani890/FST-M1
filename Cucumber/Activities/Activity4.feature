@Activity4
Feature: Data Driven test without example
    Scenario: Login with correct username and password
      Given User is on the login page
      When User enters "admin" and "password"
      Then Read the page title and confirmation message
      Then Close the browser