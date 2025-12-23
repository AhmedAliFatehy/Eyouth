package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SocialLinks {
    private WebDriver driver;
    private By faceBookLink = By.xpath("//*[name()='path' and contains(@d,'M22 12c0-5')]");
    private By linkedInLink = By.xpath("//*[name()='path' and contains(@d,'M19 3a2 2 ')]");
    private By twitterLink = By.xpath("//*[name()='path' and contains(@d,'M22.46 6c-')]");

    public SocialLinks(WebDriver driver){
        this.driver = driver;
    }

    public FacebookLinkPage clickFaceBookLink(){
        driver.findElement(faceBookLink).click();
        return new FacebookLinkPage(driver);
    }

    public LinkedInPage clickLinkedInLink(){
        driver.findElement(linkedInLink).click();
        return new LinkedInPage(driver);
    }

    public TwitterPage clickTwitterLink(){
        driver.findElement(twitterLink).click();
        return new TwitterPage(driver);
    }
}
