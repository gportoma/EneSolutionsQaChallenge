package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import static core.DriverFactory.getDriver;

public class ScreenShotUtils {

    public static final String screenshotTime = getDatetime();

    public static void takeScreenshot() {
        try {
            Thread.sleep(1900);
            File screenshotFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
            String folderName = "Evidencias";
            FileUtils.copyFile(screenshotFile, new File("src/main/resources/" + folderName + "/" + screenshotTime
                    + "/" + getDatetime() + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getDatetime() {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss", Locale.getDefault());
        return dateFormat.format(date);
    }
}
