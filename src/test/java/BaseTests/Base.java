package BaseTests;

import Pages.SearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class Base {
    protected WebDriver driver;
    protected SearchPage searchPage;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://eyouthlearning.com/");
        searchPage = new SearchPage(driver);
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
