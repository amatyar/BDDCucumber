#Author: Rabindra.amatya@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.

@SmokeFeature
Feature: Login Functionality
	@smoketest
  Scenario: Valid Login with Correct Credentials
    Given the user is on the login page
    When the user enters valid username and password
    And the clicks on the Login button
    Then the user should be redirected to the dashboard

