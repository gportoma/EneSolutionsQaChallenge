package page;

import core.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ScreenShotUtils;

import java.util.Objects;

import static core.DriverFactory.getDriver;

public class HomeBlogPage extends BasePage {

    public HomeBlogPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='sm:pt-12 lg:mt-0 lg:p-0 lg:ml-3']//a[@href='/blog']")
    private WebElement buttonBlog;

    @FindBy(xpath = "//a[@class='sm:mx-0 lg:mx-3 flex items-center hover:text-cyan text-base font-light leading-snug text-white hover:font-bold hover:border-b-4 hover:border-cyan ' and @href='https://www.enesolucoes.com.br/#servicos']\n")
    private WebElement buttonServicos;

    @FindBy(xpath = "//a[@class='sm:mx-0 lg:mx-3 flex items-center hover:text-cyan text-base font-light leading-snug text-white hover:font-bold hover:border-b-4 hover:border-cyan ' and @href='https://www.enesolucoes.com.br/#contato']\n")
    private WebElement buttonContato;

    @FindBy(xpath = "//a[@class='sm:mx-0 lg:mx-3 flex items-center hover:text-cyan text-base font-light leading-snug text-white hover:font-bold hover:border-b-4 hover:border-cyan ' and @href='https://jobs.quickin.io/enesolucoes/jobs']\n")
    private WebElement buttonVagas;

    @FindBy(xpath = "//a[@class='bg-cyan py-3 px-8 text-elephant cursor-pointer font-bold sm:text-sm md:text-base hover:text-black hover:bg-opacity-80 lg:ml-3 styles-module--button--1rzHb' and @href='https://www.enesolucoes.com.br/#contato']\n")
    private WebElement buttonContratar;

    @FindBy(xpath = "//h1[contains(text(),'Alocação de')]")
    private WebElement textPageServicos;

    @FindBy(xpath = "//h4[text()='Vagas']")
    private WebElement textPageVagas;

    @FindBy(xpath = "//span[contains(text(),'Vamos construir')]")
    private WebElement textPageContato;

    @FindBy(xpath = "//input[@type='search' and @placeholder='Tecnologia']")
    private WebElement searchWord;

    @FindBy(xpath = "//input[@type='search']/following-sibling::span[contains(@class,'ant-input-suffix')]/img")
    private WebElement buttonSearch;

    @FindBy(xpath = "//h3[@class='text-maastrichtBlue text-2.375xl font-bold pb-4 m-0 leading-[46px] lg:text-5.5xl lg:leading-[64px]']\n")
    private WebElement titlePost;

    @FindBy(xpath = "//*[@class=\"text-center text-2xl font-bold text-maastrichtBlue mb-16\"]\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n")
    private WebElement titleNoResultsFound;

    public void accessWebSite() {
        driver.get("https://www.enesolucoes.com.br/");
        dsl.toClick(buttonBlog);

    }

    public void clickButtonMenu(String menu) throws InterruptedException {
        switch (menu) {
            case "Serviços":
                highLighterMethod(buttonServicos);
                ScreenShotUtils.takeScreenshot();
                dsl.toClick(buttonServicos);
                break;
            case "Vagas":
                Thread.sleep(900);
                highLighterMethod(buttonVagas);
                ScreenShotUtils.takeScreenshot();
                dsl.toClick(buttonVagas);
                break;
            case "Contato":
                highLighterMethod(buttonContato);
                ScreenShotUtils.takeScreenshot();
                dsl.toClick(buttonContato);
                break;
            case "Contratar":
                highLighterMethod(buttonContratar);
                ScreenShotUtils.takeScreenshot();
                dsl.toClick(buttonContratar);
                break;
        }
    }

    public Boolean validePage(String tela) {
        boolean test = false;
        switch (tela) {
            case "a tela de Serviços":
                if (Objects.equals(dsl.getText(textPageServicos), "Alocação de squads ágeis com especialistas")) {
                    test = true;
                    highLighterMethod(textPageServicos);
                    ScreenShotUtils.takeScreenshot();
                }
                break;
            case "a página de vagas de emprego na Ene Soluções":
                if (Objects.equals(dsl.getText(textPageVagas), "Vagas")) {
                    test = true;
                    highLighterMethod(textPageVagas);
                    ScreenShotUtils.takeScreenshot();
                }
                break;
            case "o formulário de contato da Ene Soluções":
            case "o formulário de contratação de serviços da Ene":
                if (Objects.equals(dsl.getText(textPageContato), "Vamos construir projetos incríveis juntos?")) {
                    test = true;
                    highLighterMethod(textPageContato);
                    ScreenShotUtils.takeScreenshot();
                }
                break;
        }
        return test;
    }

    public void search(String word) {
        dsl.type(searchWord, word);
        highLighterMethod(searchWord);
        highLighterMethod(buttonSearch);
        ScreenShotUtils.takeScreenshot();
        dsl.toClick(buttonSearch);
    }

    public Boolean postIsVisible() throws Exception {
        scrollToElement(titlePost);
        highLighterMethod(titlePost);
        ScreenShotUtils.takeScreenshot();
        return titlePost.isDisplayed();
    }

    public Boolean resultNotFound(String resultNotFound) {
        highLighterMethod(titleNoResultsFound);
        ScreenShotUtils.takeScreenshot();
        return Objects.equals(dsl.getText(titleNoResultsFound), resultNotFound);
    }

    private void highLighterMethod(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].setAttribute('style', 'border: 6px solid red;');", element);
    }

    private void scrollToElement(WebElement webElement) throws Exception {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoViewIfNeeded()", webElement);
    }
}
