package org.example.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.example.drivermanager.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotHooks {

    @After
    public void takeScreenshot(Scenario scenario) {
        scenario.log(DriverManager.getDriver().getCurrentUrl());
        byte[] screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", scenario.getName());
    }
}
