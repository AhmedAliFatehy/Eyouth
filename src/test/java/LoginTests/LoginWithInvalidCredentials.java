package LoginTests;

import BaseTests.Base;
import Pages.LoginPage;
import Pages.LoginResultPage;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class LoginWithInvalidCredentials extends Base {
    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage(driver);
        LoginResultPage loginResultPage = loginPage.clickloginButtonPage();
        loginResultPage.setUserNameField("AhmedAly");
        loginResultPage.setPasswordField("12345QQ");
        loginResultPage.clickLoginButton();
        assertTrue(loginResultPage.getErrorMessageWithInvalidCredentials().contains("اسم المستخدم أو كلمة المرور غير صحيحة"));
    }
}
