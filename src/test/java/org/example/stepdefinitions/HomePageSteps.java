package org.example.stepdefinitions;

import io.cucumber.java.en.Given;
import org.example.pageobjects.pages.HomePage;

import static org.example.stepdefinitions.Hooks.driver;

public class HomePageSteps {
    @Given("User is on Login Page")
    public void userIsOnLoginPage() {
        new HomePage(driver).open()
                .clickAccountButton()
                .clickSignInLink();
    }
}
