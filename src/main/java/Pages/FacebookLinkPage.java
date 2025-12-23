package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookLinkPage {
    private WebDriver driver;


    public FacebookLinkPage(WebDriver driver){
        this.driver =  driver;
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
}
