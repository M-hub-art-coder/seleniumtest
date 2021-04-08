package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;




public class CommonVerifications {

    private static final By REGISTER_ACCOUNT = By.xpath("//div[@id=\"content\"]//h1");
    private static final By ERROR_MESSAGE = By.cssSelector("div.text-danger");
    private static final By LOGIN = By.linkText("Login");
    private static final By MY_ACCOUNT = By.xpath("//div[@id=\"content\"]//h2");

    /**
     * With this method you verify, that you are on the Pragmatic Store Page!
     *
     * @param expectedTitle - this is the title you expected to see, if you are on the right page!
     * @param errorMessage - This is message, which you will see, if you could not reach the Pragmatic Store Page!
     */

    public static void verifyRightPage(String expectedTitle,String errorMessage) {

       String actualTitle = Browser.driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, errorMessage);

    }

    /**
     * This method assure you that you are on the expected page!
     *
     * @param expectedMessage
     */
    public static void verifyRegistry(String expectedMessage) {

        String actualMessage = Browser.driver.findElement(REGISTER_ACCOUNT).getText();
        Assert.assertEquals(actualMessage, expectedMessage);

    }

    public static void verifyDidNotRegister(String expectedMessage) {

        String actualMessage = Browser.driver.findElement(ERROR_MESSAGE).getText();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    public static void verifyLoginPage(String expectedMessage) {
       String actualMessage = Browser.driver.findElement(LOGIN).getText();
       Assert.assertEquals(actualMessage, expectedMessage);
    }

    public static void verifyMyAccountPage(String expectedMessage) {
        String actualMessage = Browser.driver.findElement(MY_ACCOUNT).getText();
        Assert.assertEquals(actualMessage,expectedMessage);
    }
}
