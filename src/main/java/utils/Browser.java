package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Browser {

    public static WebDriver driver;

    /**
     * This method open the Chrome Web driver.
     */

    public static void open() {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    /**
     * This method takes you to the Shop Pragmatic page.
     */
    public static void goTo() {
        driver.get("http://shop.pragmatic.bg/");
    }

    /**
     *
     * This method close the browser!
     */
    public static void close() {
        driver.quit();
    }
}

