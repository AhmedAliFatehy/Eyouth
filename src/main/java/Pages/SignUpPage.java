package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpPage {
    private WebDriver driver;
    private By usernameField = By.id("username");
    private By nameField = By.id("name");
    private By countryDropDown = By.xpath("//div[@id='country-select']");
    private By genderDropDown = By.xpath("//div[@id='gender-select']");
    private By cityDropDown = By.xpath("//div[@id='government-select']");
    private By emailField = By.id("email");
    private By phoneNumberField = By.id("phone_number");
    private By passwordField = By.id("password");
    private By confirmPasswordField = By.id("confirmPassword");
    private By acceptButton = By.id("accept");
    private By createAccountButton = By.cssSelector("button[aria-label='button to be clicked'][type='submit']");
    private By errorMessage = By.id("username-helper-text");


    public SignUpPage(WebDriver driver){
        this.driver = driver;
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    private void selectFirstOptionFromDropdown(By dropdownLocator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions actions = new Actions(driver);

        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(dropdownLocator));

        actions.moveToElement(dropdown).pause(Duration.ofMillis(300)).click().build().perform();

        By optionLocator = By.xpath("//li[contains(@class,'MuiMenuItem-root')]");

        WebElement option = wait.until(ExpectedConditions.elementToBeClickable(optionLocator));

        actions.moveToElement(option).pause(Duration.ofMillis(300)).click().build().perform();
    }

    public void setNameField(String name){
        driver.findElement(nameField).sendKeys(name);
    }

    public void setCountryDropDown(){
        selectFirstOptionFromDropdown(countryDropDown);
    }

    public void setGenderDropDown(){
        selectFirstOptionFromDropdown(genderDropDown);
    }

    public void setCityDropDown(){
        selectFirstOptionFromDropdown(cityDropDown);
    }

    public void setEmailField(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void setPhoneNumberField(String phoneNumber){
        driver.findElement(phoneNumberField).sendKeys(phoneNumber);
    }

    public void setPasswordField(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void setConfirmPasswordField(String confirmPassword){
        driver.findElement(confirmPasswordField).sendKeys(confirmPassword);
    }

    public void setAcceptButton(){
        driver.findElement(acceptButton).click();
    }

    public void clickCreateAccountButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            wait.until(ExpectedConditions.elementToBeClickable(createAccountButton)).click();
        } catch (Exception e) {
            System.out.println("Create Account button was not clickable due to validation");
        }
    }

    public String getErrorMessage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
        return driver.findElement(errorMessage).getText();
    }
}
