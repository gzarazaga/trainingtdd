Feature: Tennis game starts

  Scenario: Home page

    Given I am on the 'home' page
    Then I see "Tennis 2.0"

    Given I am on the 'home' page
    And start the game with "Del Potro" and "Nadal"
    Then I see "Del Potro vs Nadal"