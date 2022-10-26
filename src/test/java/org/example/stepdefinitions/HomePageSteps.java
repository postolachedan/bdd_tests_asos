package org.example.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.drivermanager.DriverManager;
import org.example.pageobjects.pages.HomePage;


public class HomePageSteps {
    HomePage homePage = new HomePage(DriverManager.getDriver());
    @Given("User is on Login Page")
    public void openLoginPage() {
        homePage.open()
                .clickAccountButton()
                .clickSignInLink();
    }

    @Given("User is on the Home Page")
    public void openHomePage() {
        homePage.open();
    }

    @When("User enters {string} in the search field")
    public void search(String searchInput) {
        homePage.searchForItem(searchInput);
    }
}
