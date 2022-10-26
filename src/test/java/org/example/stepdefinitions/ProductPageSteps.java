package org.example.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageobjects.pages.ProductPage;

import static org.example.stepdefinitions.Hooks.driver;
import static org.testng.Assert.assertEquals;

public class ProductPageSteps {
    ProductPage productPage = new ProductPage(driver);
    @And("Tries to add it to the cart without selecting a size")
    public void triesToAddItToTheCart() {
        productPage.addToCart();
    }

    @Then("A {string} message is displayed:")
    public void aMessageIsDisplayed(String message) {
        assertEquals(productPage.getMessage(), message);
    }
}
