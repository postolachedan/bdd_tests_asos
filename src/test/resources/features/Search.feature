Feature: Search asos.com

  Scenario: Search with valid input
    Given User is on the Home Page
    When User enters a brand name: "Nike" in the search field
    Then A list of results is displayed containing "Nike"

  Scenario: Search, no results
    Given User is on the Home Page
    When User enters "9asdfkj;8o8fasdf" in the search field
    Then A message is displayed: "NOTHING MATCHES YOUR SEARCH"