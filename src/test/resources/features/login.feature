Feature: Login functionality test
  In order to purchase from Amazon portal,
  I want to login to Amazon portal
  So that I can place my orders.

  Scenario Outline: Test login page with different combination of username and password
    Given I am on the Amazon Login page
    When I enter "<userName>"
    And I enter "<passWord>"
    And I click on Login button
    Then I am on home page
    Examples:
      | userName            | passWord  |
      | username1@gmail.com | Password1 |
      | username2@gmail.com | Password2 |


