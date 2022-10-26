package org.example.pageobjects.pages;

import org.example.pageobjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {
    @FindBy(xpath = "//span[@type='accountHalloweenUnfilled']")
    WebElement accountButton;
    @FindBy(id = "chrome-search")
    WebElement searchField;
    By acceptBtn = By.id("onetrust-accept-btn-handler");

    public static final String ASOS_URL = "https://www.asos.com/";

    public HomePage open() {
        driver.get(ASOS_URL);
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(acceptBtn))
                .click();
        return this;
    }

    public HomePage clickAccountButton() {
        accountButton.click();
        return this;
    }

    public void clickSignInLink() {
        WebElement signInLink = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@data-testid='signin-link']"))));
        signInLink.click();
    }

    public void searchForItem(String searchInput) {
        searchField.sendKeys(searchInput + Keys.ENTER);
    }
}
