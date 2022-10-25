package org.example.pageobjects.pages;

import org.example.pageobjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "signin")
    WebElement signInButton;
    @FindBy(id = "EmailAddress-error")
    WebElement emailErrorMessage;
    @FindBy(id = "Password-error")
    WebElement passwordErrorMessage;
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void signInWithEmptyFields() {
        signInButton.click();
    }

    public String getEmailErrorMessage() {
        return emailErrorMessage.getText();
    }

    public String getPasswordErrorMessage() {
        return passwordErrorMessage.getText();
    }
}
