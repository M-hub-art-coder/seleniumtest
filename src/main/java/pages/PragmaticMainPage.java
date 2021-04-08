package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.Browser;

public class PragmaticMainPage {

    private static final By MY_ACCOUNT_BUTTON = By.cssSelector("span.caret");
    private static final By DROP_DOWN_BUTTON = By.cssSelector("ul.dropdown-menu.dropdown-menu-right");
    private static final By REGISTER_BUTTON = By.xpath("//ul[@class=\"dropdown-menu dropdown-menu-right\"]//a");
    private static final By FIRST_NAME = By.id("input-firstname");
    private static final By LAST_NAME = By.id("input-lastname");
    private static final By EMAIL_ADRESS = By.id("input-email");
    private static final By TELEPHONE_NUMBER = By.id("input-telephone");
    private static final By INSERT_PASS = By.id("input-password");
    private static final By CONFIRM_PASS = By.id("input-confirm");
    private static final By CHECK_BUTTON = By.xpath("//input[@name=\"agree\"]");
    private static final By CONTINUE = By.cssSelector("input.btn.btn-primary");
    private static final By RADIO_BUTTON = By.xpath("//label[@class=\"radio-inline\"]//input[@value=\"1\"]");
    private static final By LOGIN_BUTTON =By.linkText("Login");

    /**
     *This method takes you to the registration form.
     */
    public static void goToRegistryAplication() {

        Browser.driver.findElement(MY_ACCOUNT_BUTTON).click();
        Browser.driver.findElement(REGISTER_BUTTON).click();



    }

    /**
     *With this method you insert the first four fields of the registration form.
     * @param firstName- insert your first name
     * @param lastName-insert your last name
     * @param email-insert your email address
     * @param telephoneNumber-insert your telephone number
     */
    public static void insertPersonalRegistrationDetails(String firstName,String lastName,String email, String telephoneNumber){

        Browser.driver.findElement(FIRST_NAME).sendKeys(firstName);
        Browser.driver.findElement(LAST_NAME).sendKeys(lastName);
        Browser.driver.findElement(EMAIL_ADRESS).sendKeys(email);
        Browser.driver.findElement(TELEPHONE_NUMBER).sendKeys(telephoneNumber);


    }

    /**
     * With this method the expected move is to insert your pass and to confirm it
     */

    public static void insertPassAndContinue(String pass, String confirmPass) {
        Browser.driver.findElement(INSERT_PASS).sendKeys(pass);
        Browser.driver.findElement(CONFIRM_PASS).sendKeys(confirmPass);

        Browser.driver.findElement(RADIO_BUTTON).click();
        Browser.driver.findElement(CHECK_BUTTON).click();
        Browser.driver.findElement(CONTINUE).click();

    }

    /**
     *
     *
     */
    public static void goToLoginAplication() {

        Browser.driver.findElement(MY_ACCOUNT_BUTTON).click();
        Browser.driver.findElement(LOGIN_BUTTON).click();

    }
}
