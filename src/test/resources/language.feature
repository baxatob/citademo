#@run
Feature: change language
  #this is for training purposes

  Scenario: user switch languages on Latvian site
    Given that user on the LV landing page
    When user clicks on link EN
    Then website language is English

    When user clicks on link RU
    Then website language is Russian

    When user clicks on link LV
    Then website language is Latvian

    Then user close browser