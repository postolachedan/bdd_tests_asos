package org.example.pageobjects.pages;

import org.example.pageobjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {
    @FindBy(xpath = "//span[@type='accountHalloweenUnfilled']")
    WebElement accountButton;

    public static final String ASOS_URL = "https://www.asos.com/";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage open() {
        driver.get(ASOS_URL);
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
}
