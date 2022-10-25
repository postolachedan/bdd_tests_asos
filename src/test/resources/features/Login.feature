Feature: Login asos.com

  Scenario: Login with empty fields
    Given User is on Login Page
    And Doesn't fill email and password
    When User tries to sign
    Then Two error messages are displayed: "Oops! You need to type your email here" and "Hey, we need a password here"

  Scenario: Login with empty password and valid email
    Given User is on Login Page
    And Enters a valid email address
    When User tries to sign
    Then An empty password error message is displayed: "Hey, we need a password here"

  Scenario: Login with empty email and valid password
    Given User is on Login Page
    And Enters a valid password
    When User tries to sign
    Then An empty email error message is displayed: "Oops! You need to type your email here"
