@LoginFeature @TestSuiteID=1
Feature: Login Application

  @Positive @Component @Ui
  Scenario: Login with correct username and password
    Given User is on login page
    When User insert username and password
    And User clicks on login button
    Then User should login to the application

  @Negative @Component @Ui
  Scenario: Login with invalid username and password
    Given User is on login page
    When User insert invalid username and password
    And User clicks on login button
    Then User should see error username message

  @Negative @Component @Ui
  Scenario: Login with empty username and password
    Given User is on login page
    When User insert empty username and password
    And User clicks on login button
    Then User should see error username message

  @Negative @Boundaries @Component @Ui
  Scenario: Login with correct username and password - insensitive
    Given User is on login page
    When User insert insensitive username and password
    And User clicks on login button
    Then User should see error username message

  @Positive @Boundaries @Component @Ui
  Scenario: Login with correct username and password - max username length
    Given User is on login page
    When User insert username max length and password
    And User clicks on login button
    Then User should see error username message

  @Positive @Boundaries @Component @Ui
  Scenario: Login with correct username and password - max password length
    Given User is on login page
    When User insert username and password max length
    And User clicks on login button
    Then User should see error password message