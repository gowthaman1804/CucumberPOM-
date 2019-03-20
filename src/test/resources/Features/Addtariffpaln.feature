#Author: Gowthaman Addtariffplan
Feature: To test add tariff plan

  Scenario: To add details in tariif plan
    Given The user is in add tariif plan page
    When The user fill the details in tariff plan
    And The user click the submit button
    Then The user should see the success msg
