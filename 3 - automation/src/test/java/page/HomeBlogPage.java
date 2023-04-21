package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Objects;

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

    public void accessWebSite() {
        driver.get("https://www.enesolucoes.com.br/");
        dsl.toClick(buttonBlog);
    }

    public void clickButtonMenu(String menu) {
        switch (menu) {
            case "Serviços":
                dsl.toClick(buttonServicos);
                break;
            case "Vagas":
                dsl.toClick(buttonVagas);
                break;
            case "Contato":
                dsl.toClick(buttonContato);
                break;
            case "Contratar":
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
                }
                break;
            case "a página de vagas de emprego na Ene Soluções":
                if (Objects.equals(dsl.getText(textPageVagas), "Vagas")) {
                    test = true;
                }
                break;
            case "o formulário de contato da Ene Soluções" :
            case "o formulário de contratação de serviços da Ene":
                if (Objects.equals(dsl.getText(textPageContato), "Vamos construir projetos incríveis juntos?")) {
                    test = true;
                }
                break;
        }
        return test;
    }
}
