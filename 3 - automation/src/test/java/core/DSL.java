package core;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static core.DriverFactory.getDriver;

public class DSL {

     final WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

    public void type(WebElement element, String text) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
        element.sendKeys(text);
    }

    public void toClick(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public String getText(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.getText();
    }

    public void setComboBox(WebElement webElement, Integer value) {
        Select select = new Select(webElement);
        select.selectByIndex(value);
    }

}
