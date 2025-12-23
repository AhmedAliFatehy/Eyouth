package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JoinUsPage {
    private WebDriver driver;
    private By joinUsButton = By.cssSelector(".btn.btn-outline-primary.mx-1.navbar_btn_signup__z4Cok");
    private By joinUsAsStudent = By.xpath("(//div[@class='btn btn-light'][contains(text(),'انضم لنا كطالب')])[1]");

    public JoinUsPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickJoinUsButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(joinUsButton));
        driver.findElement(joinUsButton).click();
    }

    public SignUpPage joinUsAsStudent(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(joinUsAsStudent));
        driver.findElement(joinUsAsStudent).click();
        return new SignUpPage(driver);
    }

}
