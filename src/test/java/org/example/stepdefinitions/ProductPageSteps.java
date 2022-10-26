package org.example.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageobjects.pages.ProductPage;

import static org.testng.Assert.assertEquals;

public class ProductPageSteps {
    private final ProductPage productPage = new ProductPage();
    @And("Tries to add it to the cart")
    public void addItemToCart() {
        productPage.addToCart();
    }

    @Then("A {string} message is displayed:")
    public void verifySizeErrorMessage(String expectedMessage) {
        assertEquals(productPage.getSizeErrorMessage(), expectedMessage);
    }

    @Then("A message is displayed: {string} on the product page")
    public void verifyAddedToCartConfirmationMessage(String expectedMessage) {
        assertEquals(productPage.getAddedToCartConfirmationMessage(), expectedMessage);
    }

    @And("Selects a size")
    public void selectASize() {
        productPage.selectASize(1);
    }
}
