package SocialLinksTests;

import BaseTests.Base;
import Pages.LinkedInPage;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class LinkedInLink extends Base {
    @Test
    public void linkedInLinkTest(){
        LinkedInPage linkedInLink = socialLinks.clickLinkedInLink();

        assertTrue(linkedInLink.getCurrentUrl().contains("linkedin.com"));

    }
}
