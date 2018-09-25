@run
Feature: login
  #login to latvian internetbank

  Scenario: user login to LV page
    Given that user on the latvian landing page
    When user enter invalid credentials and click on login button
    Then user can view an alert