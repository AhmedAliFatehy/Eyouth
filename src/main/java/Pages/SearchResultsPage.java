package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchResultsPage {
    private final WebDriverWait wait;
    private WebDriver driver;
    private By pageTitle = By.tagName("h1");

    public SearchResultsPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public String getPageTitle(){
        wait.until(driver -> {
            String text = driver.findElement(pageTitle).getText();
            return text != null && !text.trim().isEmpty();
        });
        return driver.findElement(pageTitle).getText().trim();
    }

}
