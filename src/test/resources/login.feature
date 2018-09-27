@run
Feature: login
  #login to internetbank

  Scenario: user login to EE page using ID-card
    Given that user on the EE landing page
    When user login using ID-card
    Then user can view a start page

  Scenario: user login to LT page using PIN-calculator
    Given that user on the LT landing page
    When user login using PIN-calculator
    Then user can view a start page

  Scenario: user login to LV page using ID-card
    Given that user on the LV landing page
    When user login using PIN-calculator
    Then user can view a start page