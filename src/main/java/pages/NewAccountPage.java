package pages;

import org.openqa.selenium.By;
import utils.Browser;

public class NewAccountPage {

    private static final By HOME_BUTTON = By.cssSelector("i.fa.fa-home");


    public static void goBack() {

        Browser.driver.findElement(HOME_BUTTON).click();
    }
}
