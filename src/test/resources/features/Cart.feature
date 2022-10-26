Feature: Cart functionality

  Background: User is on the home page
    Given User is on the Home Page

  Scenario: Adding a product to the cart without selecting a size
    Given User enters a brand name: "Nike" in the search field
    When User selects an item
    And Tries to add it to the cart without selecting a size
    Then A "Please select from the available colour and size options" message is displayed:

