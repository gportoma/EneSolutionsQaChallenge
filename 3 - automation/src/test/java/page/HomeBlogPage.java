package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeBlogPage extends BasePage {

    public HomeBlogPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='sm:pt-12 lg:mt-0 lg:p-0 lg:ml-3']//a[@href='/blog']")
    private WebElement buttonBlog;

    public void accessWebSite() {
        driver.get("https://www.enesolucoes.com.br/");
        dsl.toClick(buttonBlog);
    }

}
