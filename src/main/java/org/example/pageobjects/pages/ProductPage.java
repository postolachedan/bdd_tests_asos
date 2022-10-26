package org.example.pageobjects.pages;

import org.example.pageobjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//span[@data-bind='text: buttonText']")
    WebElement addToBagButton;
    @FindBy(id = "selectSizeError")
    WebElement errorMessage;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void addToCart() {
        addToBagButton.click();
    }

    public String getMessage() {
        return errorMessage.getText();
    }
}
