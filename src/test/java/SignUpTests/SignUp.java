package SignUpTests;

import BaseTests.Base;
import Pages.JoinUsPage;
import Pages.SignUpPage;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class SignUp extends Base {
    @Test
    public void signUp(){
        JoinUsPage joinUsPage = new JoinUsPage(driver);

        joinUsPage.clickJoinUsButton();
        SignUpPage signUpPage = joinUsPage.joinUsAsStudent();
        signUpPage.setNameField("Ahmed");
        signUpPage.setEmailField("ahmed@gmail.com");
        signUpPage.setPhoneNumberField("01122334455");
        signUpPage.setPasswordField("12345Qq++");
        signUpPage.setConfirmPasswordField("12345Qq++");
        signUpPage.setCountryDropDown();
        signUpPage.setGenderDropDown();
        signUpPage.setCityDropDown();
        signUpPage.setAcceptButton();
        signUpPage.clickCreateAccountButton();

        assertTrue(signUpPage.getErrorMessage().contains(" اسم المستخدم مطلوب"));
    }
}
