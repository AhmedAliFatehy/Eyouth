package LoginTests;

import BaseTests.Base;
import Pages.LoginPage;
import Pages.LoginResultPage;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class LoginWithEmptyFields extends Base {
    @Test
    public void loginTests(){
        LoginPage loginPage = new LoginPage(driver);
        LoginResultPage loginResultPage = loginPage.clickloginButtonPage();

        loginResultPage.clickLoginButton();

        assertTrue(loginResultPage.getErrorMessageWithEmptyFieldsUserName().contains("اسم المستخدم مطلوب"));
        assertTrue(loginResultPage.getErrorMessageWithEmptyFieldsPassword().contains("اسم المستخدم مطلوب"));
    }
}
