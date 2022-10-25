Feature: Login asos.com

  Scenario: Login with empty fields
    Given User is on Login Page
    When User tries to sign in leaving email and password fields empty
    Then Two error messages are displayed: "Oops! You need to type your email here" and "Hey, we need a password here"