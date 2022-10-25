package org.example.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageobjects.pages.LoginPage;

import static org.example.stepdefinitions.Hooks.driver;
import static org.testng.Assert.assertEquals;

public class LoginPageSteps {

    LoginPage loginPage = new LoginPage(driver);


    @Then("Two error messages are displayed: {string} and {string}")
    public void getErrorMessagesForEmptyFields(String emailErrorMessage, String passwordErrorMessage) {
        assertEquals(loginPage.getEmptyEmailErrorMessage(), emailErrorMessage);
        assertEquals(loginPage.getEmptyPasswordErrorMessage(), passwordErrorMessage);
    }

    @When("Enters a valid email address")
    public void enterValidEmail() {
        loginPage.enterEmailAddress("email@email.com");
    }

    @And("Doesn't fill email and password")
    public void doesnTFillEmailAndPassword() {

    }

    @When("User tries to sign")
    public void userTriesToSign() {
        loginPage.clickSignIn();

    }

    @Then("An empty password error message is displayed: {string}")
    public void anEmptyPasswordErrorMessageIsDisplayed(String passwordErrorMessage) {
        assertEquals(loginPage.getEmptyPasswordErrorMessage(), passwordErrorMessage);
    }

    @Then("An empty email error message is displayed: {string}")
    public void anEmptyEmailErrorMessageIsDisplayed(String emailErrorMessage) {
        assertEquals(loginPage.getEmptyEmailErrorMessage(), emailErrorMessage);
    }

    @And("Enters a valid password")
    public void entersAValidPassword() {
        loginPage.enterPassword("SuperSecretPassword000");
    }

    @Then("A login error message is displayed: {string}")
    public void aLoginErrorMessageIsDisplayed(String loginErrorMessage) {
        assertEquals(loginPage.getLoginErrorMessage(), loginErrorMessage);
    }
}
