package Pages;

import org.openqa.selenium.WebDriver;

public class LinkedInPage {
    private WebDriver driver;

    public LinkedInPage(WebDriver driver){
        this.driver = driver;
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
}
