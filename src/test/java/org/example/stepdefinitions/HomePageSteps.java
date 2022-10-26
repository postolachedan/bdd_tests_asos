package org.example.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pageobjects.pages.HomePage;

import static org.example.stepdefinitions.Hooks.driver;

public class HomePageSteps {
    HomePage homePage = new HomePage(driver);
    @Given("User is on Login Page")
    public void userIsOnLoginPage() {
        homePage.open()
                .clickAccountButton()
                .clickSignInLink();
    }

    @Given("User is on the Home Page")
    public void userIsOnTheHomePage() {
        homePage.open();
    }

    @When("User enters a brand name: {string} in the search field")
    public void userEntersABrandNameInTheSearchField(String brandName) {
        homePage.searchForItem(brandName);
    }

    @When("User enters {string} in the search field")
    public void userEntersInTheSearchField(String searchInput) {
        homePage.searchForItem(searchInput);
    }
}
