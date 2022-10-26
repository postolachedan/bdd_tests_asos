Feature: As a user i want to login to be able to add items to the cart and checkout

  @SmokeTest
  Scenario: Login with empty fields should not be allowed
    Given User is on Login Page
    And Doesn't fill email and password
    When User tries to sign
    Then Two error messages are displayed: "Oops! You need to type your email here" and "Hey, we need a password here"

  @SmokeTest
  Scenario: Login with empty password and valid email should not be allowed
    Given User is on Login Page
    And Enters a valid email address
    When User tries to sign
    Then An empty password error message is displayed: "Hey, we need a password here"

  @SmokeTest
  Scenario: Login with empty email and valid password should not be allowed
    Given User is on Login Page
    And Enters a valid password
    When User tries to sign
    Then An empty email error message is displayed: "Oops! You need to type your email here"
