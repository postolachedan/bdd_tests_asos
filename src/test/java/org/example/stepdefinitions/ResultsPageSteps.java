package org.example.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.drivermanager.DriverManager;
import org.example.pageobjects.pages.ResultsPage;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ResultsPageSteps {
    ResultsPage resultsPage = new ResultsPage(DriverManager.getDriver());
    @Then("A list of results is displayed containing {string}")
    public void verifySearchResultsItemNames(String brandName) {
        List<String> searchResults = resultsPage.getSearchResultsNames();
        assertTrue(searchResults.stream()
                .anyMatch(resultName -> resultName.contains(brandName.toLowerCase())));
    }

    @Then("A message is displayed: {string}")
    public void verifyNoResulsMessage(String message) {
        assertEquals(resultsPage.getNoResultsMessage(), message);
    }

    @When("User selects an item")
    public void selectAnItem() {
        resultsPage.selectAResult();
    }
}
