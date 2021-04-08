package logInTests.positive;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LogInPage;
import pages.PragmaticMainPage;
import utils.Browser;
import utils.CommonVerifications;

public class positiveLogInTest {

    @BeforeMethod
    public void setUp(){

        Browser.open();
    }

    @Test
    public void logIn(){

        Browser.goTo();
        PragmaticMainPage.goToLoginAplication();

        CommonVerifications.verifyLoginPage("Login");

        LogInPage.insertEmailAndPass("marinela5@abv.bg","12345");

        CommonVerifications.verifyMyAccountPage("My Account");




    }
}
