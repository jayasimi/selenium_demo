Feature: Test functionality test
  In order to purchase from Amazon portal,
  I want to login to Amazon portal
  So that I can place my orders.

  Scenario : Test landing page
    Given I visit amazon UK site
    When I click on 'SignIn'
    Then I am on the Login page
