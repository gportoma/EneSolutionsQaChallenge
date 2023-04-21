package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DriverFactory {

    private static WebDriver driver = null;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/webdriver/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
        }
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.close();
            driver = null;
        }
    }

}