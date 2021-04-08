package logInTests.negative;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.PragmaticMainPage;
import utils.Browser;
import utils.CommonVerifications;

public class NegativeRegistrationTest {
    @BeforeMethod
    public void setUp(){
        Browser.open();
    }

    @Test
    public void negativeRegistrationTest() {

        Browser.goTo();
        CommonVerifications.verifyRightPage("Pragmatic Test Store", "You are not on the page of Pragmatic Store!");

        PragmaticMainPage.goToRegistryAplication();
        CommonVerifications.verifyRegistry("Register Account");

        PragmaticMainPage.insertPersonalRegistrationDetails(" "," "," "," ");
        PragmaticMainPage.insertPassAndContinue(" "," ");

        CommonVerifications.verifyDidNotRegister("First Name must be between 1 and 32 characters!");
    }

    @AfterMethod
    public void tearDown(){
        Browser.close();
    }
}
