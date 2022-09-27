Feature: Search Operations
  Scenario: Type in searchbar and search
    Given I am on the homepage
    When I click the Products button
    And Type some text in searchbar
    Then See all products contain text in searchbar
