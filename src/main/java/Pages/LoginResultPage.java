package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginResultPage {
    private WebDriver driver;
    private By userNameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.xpath("//button[@type='submit']");
    private By errorMessageWithInvalidCredentials = By.xpath("//div[@class='MuiAlert-message muirtl-1xsto0d']");
    private By errorMessageWithEmptyFieldsUserName = By.id("username-helper-text");
    private By errorMessageWithEmptyFieldsPassword = By.id("password-helper-text");

    public LoginResultPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUserNameField(String userName){
        driver.findElement(userNameField).sendKeys(userName);
    }

    public void setPasswordField(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

    public String getErrorMessageWithInvalidCredentials(){
        return driver.findElement(errorMessageWithInvalidCredentials).getText();
    }

    public String getErrorMessageWithEmptyFieldsUserName(){
        return driver.findElement(errorMessageWithEmptyFieldsUserName).getText();
    }

    public String getErrorMessageWithEmptyFieldsPassword(){
        return driver.findElement(errorMessageWithEmptyFieldsPassword).getText();
    }
}

