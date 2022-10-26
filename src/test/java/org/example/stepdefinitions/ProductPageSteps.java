package org.example.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.drivermanager.DriverManager;
import org.example.pageobjects.pages.ProductPage;

import static org.testng.Assert.assertEquals;

public class ProductPageSteps {
    ProductPage productPage = new ProductPage(DriverManager.getDriver());
    @And("Tries to add it to the cart")
    public void addItemToCart() {
        productPage.addToCart();
    }

    @Then("A {string} message is displayed:")
    public void verifySizeErrorMessage(String message) {
        assertEquals(productPage.getSizeErrorMessage(), message);
    }

    @Then("A message is displayed: {string} on the product page")
    public void verifyAddedToCartConfirmationMessage(String message) {
        assertEquals(productPage.getAddedToCartConfirmationMessage(), message);
    }

    @And("Selects a size")
    public void selectASize() {
        productPage.selectASize(1);
    }
}
