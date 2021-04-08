package logInTests.positive;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.NewAccountPage;
import pages.PragmaticMainPage;
import utils.Browser;
import utils.CommonVerifications;

public class PossitiveRegistrationTest {

    @BeforeMethod
    public void setUp(){

        Browser.open();
    }
    @Test
    public void positiveRegistrationTest(){

        Browser.goTo();

       CommonVerifications.verifyRightPage("Pragmatic Test Store","You could not reach Pragmatic Test Store!");

        PragmaticMainPage.goToRegistryAplication();

       CommonVerifications.verifyRegistry("Register Account");

       PragmaticMainPage.insertPersonalRegistrationDetails( "Marinela","Petkova","marinela5@abv.bg","123");
       PragmaticMainPage.insertPassAndContinue("12345", "12345");

       CommonVerifications.verifyRegistry("Your Account Has Been Created!");

       NewAccountPage.goBack();


    }

    @AfterMethod
    public void tearDown(){

        Browser.close();
    }
}
