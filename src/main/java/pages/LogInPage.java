package pages;

import org.openqa.selenium.By;
import utils.Browser;

public class LogInPage {

    private static final By EMAIL_FIELD = By.id("input-email");
    private static final By PASS_FIELD = By.id("input-password");
    private static final By LOGIN_BUTTON =By.cssSelector("input.btn.btn-primary");

    /**
     * With this method you log in Shop Pragmatic
     * @param email-insert the e-mail you are register
     * @param pass - insert the right password
     */

    public static void insertEmailAndPass(String email, String pass) {
        Browser.driver.findElement(EMAIL_FIELD).sendKeys(email);
        Browser.driver.findElement(PASS_FIELD).sendKeys(pass);

        Browser.driver.findElement(LOGIN_BUTTON).click();

    }
}
