package org.example.pageobjects.pages;

import org.example.pageobjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class ResultsPage extends BasePage {
    @FindBy(xpath = "//div[@data-auto-id='productTileDescription']//h2")
    List<WebElement> results;
    @FindBy(xpath = "//section[contains(@class, 'grid-backgroundWrapper__row')]//h2")
    WebElement noResultsLabel;
    @FindBy(xpath = "//a[@class='B36cezB']")
    List<WebElement> searchResults;



    public ResultsPage(WebDriver driver) {
        super(driver);
    }

    public List<String> getSearchResultsNames() {
        return results.stream()
                .map(WebElement::getText)
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }

    public String getNoResultsMessage() {
        return noResultsLabel.getText();
    }

    public void selectAResult() {
        searchResults.get(1).click();
    }
}
