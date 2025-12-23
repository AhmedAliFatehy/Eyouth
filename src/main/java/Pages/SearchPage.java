package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By inputAreaField = By.id("highlights-demo");
    private By searchIcon = By.cssSelector(".search-button");
    private By suggestionsContainer = By.cssSelector("ul[role='listbox']");

    public SearchPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void setInputAreaField(String inputArea){
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputAreaField));
        driver.findElement(inputAreaField).clear();
        driver.findElement(inputAreaField).sendKeys(inputArea);
    }

    public void selectSuggestion(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(suggestionsContainer));
        driver.findElement(inputAreaField).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
    }

    public SearchResultsPage clickSearchIcon(){
        wait.until(ExpectedConditions.elementToBeClickable(searchIcon));
        driver.findElement(searchIcon).click();
        return new SearchResultsPage(driver);
    }
}
