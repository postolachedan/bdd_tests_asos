package org.example.pageobjects;

import org.example.drivermanager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public abstract class BasePage {

    protected WebDriver driver;

    protected BasePage() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 5), this);
    }
}
