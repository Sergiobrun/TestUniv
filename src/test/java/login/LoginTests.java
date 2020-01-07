package login;

import base.BaseTest;
import net.bytebuddy.build.ToStringPlugin;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTests extends BaseTest {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginpage = homePage.clickFormAuth();
        SecureAreaPage secureAreaPage = loginpage.Login("tomsmith", "SuperSecretPassword!");
        //assertEquals(secureAreaPage.getAlertText(),
        //        "You logged into a secure area! x","fallo por gato");
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"));

    }

}
