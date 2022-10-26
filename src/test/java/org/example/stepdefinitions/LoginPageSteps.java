package org.example.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.drivermanager.DriverManager;
import org.example.pageobjects.pages.LoginPage;

import static org.testng.Assert.assertEquals;

public class LoginPageSteps {

    LoginPage loginPage = new LoginPage(DriverManager.getDriver());


    @Then("Two error messages are displayed: {string} and {string}")
    public void verifyErrorMessagesForEmptyFields(String emailErrorMessage, String passwordErrorMessage) {
        verifyEmptyEmailErrorMessage(emailErrorMessage);
        verifyEmptyPasswordErrorMessage(passwordErrorMessage);
    }

    @When("Enters a valid email address")
    public void enterValidEmail() {
        loginPage.enterEmailAddress("email@email.com");
    }

    @And("Doesn't fill email and password")
    public void donTFillEmailAndPassword() {

    }

    @When("User tries to sign")
    public void signIn() {
        loginPage.clickSignIn();

    }

    @Then("An empty password error message is displayed: {string}")
    public void verifyEmptyPasswordErrorMessage(String passwordErrorMessage) {
        assertEquals(loginPage.getEmptyPasswordErrorMessage(), passwordErrorMessage);
    }

    @Then("An empty email error message is displayed: {string}")
    public void verifyEmptyEmailErrorMessage(String emailErrorMessage) {
        assertEquals(loginPage.getEmptyEmailErrorMessage(), emailErrorMessage);
    }

    @And("Enters a valid password")
    public void enterAValidPassword() {
        loginPage.enterPassword("SuperSecretPassword000");
    }
}
