package SignUpTests;

import BaseTests.Base;
import Pages.JoinUsPage;
import Pages.SignUpPage;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class SignUpLink extends Base {
    @Test
    public void signUpTest(){
        JoinUsPage joinUsPage = new JoinUsPage(driver);
        joinUsPage.clickJoinUsButton();
        SignUpPage signUpPage = joinUsPage.joinUsAsStudent();
        assertTrue(signUpPage.getCurrentUrl().contains("/signup"));
    }
}
