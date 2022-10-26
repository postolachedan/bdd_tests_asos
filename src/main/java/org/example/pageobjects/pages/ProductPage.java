package org.example.pageobjects.pages;

import org.example.pageobjects.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//span[@data-bind='text: buttonText']")
    WebElement addToBagButton;
    @FindBy(id = "selectSizeError")
    WebElement errorMessage;
    @FindBy(xpath = "//div[@class='_1F1C1jC']")
    WebElement addedToCartMessage;
    @FindBy(id = "main-size-select-0")
    WebElement sizeSelectDropDown;

    public void addToCart() {
        addToBagButton.click();
    }

    public String getSizeErrorMessage() {
        return errorMessage.getText();
    }

    public String getAddedToCartConfirmationMessage() {
        return addedToCartMessage.getText();
    }

    public void selectASize(int index) {
        sizeSelectDropDown.click();
        Select sizeSelect = new Select(sizeSelectDropDown);
        sizeSelect.selectByIndex(index);
    }
}
