Feature: Check, that letter, mark as a spam go to tresh folder.

  Scenario Outline: Check spam letter
    Given I am on 'https://gmail.com/' website
    When I login as '<user1>' with password '<pass1>'
    And I send email to '<user2>'
    And I login as '<user2>' with password '<pass2>'
    And I mark latter from '<user1>' as a spam
    And I login as '<user1>' with password '<pass1>'
    And I send email to '<user2>'
    Then I login as '<user2>' with password '<pass2>'
    And Check, I have a spam letter from '<user1>'
    Examples:
      |user1                    | pass1     |user2                  |pass2      |
      |orlkat201502@gmail.com   | epam2015  |orlkat201501@gmail.com |epam2015   |
