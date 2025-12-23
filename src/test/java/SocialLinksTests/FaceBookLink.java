package SocialLinksTests;

import BaseTests.Base;
import Pages.FacebookLinkPage;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FaceBookLink extends Base {
    @Test
    public void faceBookLinkTests(){
        FacebookLinkPage faceBookLink = socialLinks.clickFaceBookLink();

        assertTrue(faceBookLink.getCurrentUrl().contains("facebook.com"));
    }
}
