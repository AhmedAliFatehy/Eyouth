package SocialLinksTests;

import BaseTests.Base;
import Pages.TwitterPage;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class TwitterLink extends Base {
    @Test
    public void twitterLinkTest(){
        TwitterPage twitterLink = socialLinks.clickTwitterLink();

        assertTrue(twitterLink.getCurrentUrl().contains("x.com"));

    }
}
