Feature: Search asos.com
  @SmokeTest
  Scenario: Search with valid input
    Given User is on the Home Page
    When User enters "Nike" in the search field
    Then A list of results is displayed containing "Nike"
  @SmokeTest
  Scenario: Search, no results
    Given User is on the Home Page
    When User enters "9asdfkj;8o8fasdf" in the search field
    Then A message is displayed: "NOTHING MATCHES YOUR SEARCH"