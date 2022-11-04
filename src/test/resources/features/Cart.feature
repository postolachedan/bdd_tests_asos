Feature: Cart functionality

  Background: User is on the home page
    Given User is on the Home Page

  @SmokeTest
  Scenario: Adding a product to the cart without selecting a size should not be allowed
    Given User enters "Nike" in the search field
    When User selects an item
    And Tries to add it to the cart
    Then A "Please select from the available colour and size options" message is displayed:

  Scenario: Adding a product to the cart displays a confirm message
    Given User enters "Nike" in the search field
    When User selects an item
    And Selects a size
    And Tries to add it to the cart
    Then A message is displayed: "It's in the bag - We'll hold it for an hour" on the product page

