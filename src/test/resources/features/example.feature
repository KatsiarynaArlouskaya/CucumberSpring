Feature: Check,
  that letter, mark as a spam go to tresh folder.

  Scenario: Check spam letter
    Given I am on website
    When I login as 'user1' with password 'pass1'
    Then All good

