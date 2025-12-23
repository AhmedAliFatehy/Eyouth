package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By loginButton = By.xpath("//button[contains(@class,'navbar_btn_signin__aLCnP')]");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public LoginResultPage clickloginButtonPage(){
        driver.findElement(loginButton).click();
        return new LoginResultPage(driver);
    }


}
