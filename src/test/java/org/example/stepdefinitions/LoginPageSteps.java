package org.example.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageobjects.pages.LoginPage;

import static org.example.stepdefinitions.Hooks.driver;
import static org.testng.Assert.assertEquals;

public class LoginPageSteps {

    LoginPage loginPage = new LoginPage(driver);
    @When("User tries to sign in leaving email and password fields empty")
    public void userTriesSoSignInLeavingEmailAndPasswordFieldsEmpty() {
       loginPage.signInWithEmptyFields();
    }

    @Then("Two error messages are displayed: {string} and {string}")
    public void twoErrorMessagesAreDisplayedAnd(String emailErrorMessage, String passwordErrorMessage) {
        assertEquals(loginPage.getEmailErrorMessage(), emailErrorMessage);
        assertEquals(loginPage.getPasswordErrorMessage(), passwordErrorMessage);
    }
}
