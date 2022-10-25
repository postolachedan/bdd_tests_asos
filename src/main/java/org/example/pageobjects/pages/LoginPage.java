package org.example.pageobjects.pages;

import org.example.pageobjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "signin")
    WebElement signInButton;
    @FindBy(id = "EmailAddress-error")
    WebElement emptyEmailErrorMessage;
    @FindBy(id = "Password-error")
    WebElement emptyPasswordErrorMessage;
    @FindBy(id = "EmailAddress")
    WebElement emailField;
    @FindBy(id = "Password")
    WebElement passwordField;
    @FindBy(id = "loginErrorMessage")
    WebElement loginErrorMessage;
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void clickSignIn() {
        signInButton.click();
    }

    public String getEmptyEmailErrorMessage() {
        return emptyEmailErrorMessage.getText();
    }

    public String getEmptyPasswordErrorMessage() {
        return emptyPasswordErrorMessage.getText();
    }

    public void enterEmailAddress(String emailAddress) {
        emailField.sendKeys(emailAddress);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public String getLoginErrorMessage() {
        return loginErrorMessage.getText();
    }
}
