package steps;

import core.DriverFactory;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import page.HomeBlogPage;

public class MenuStep {

    private final HomeBlogPage homeBlogPage;


    public MenuStep() {
        homeBlogPage = new HomeBlogPage(DriverFactory.getDriver());
    }

    @Dado("que eu estou na tela inicial do Blog da Ene Soluções")
    public void queEuEstouNaTelaInicialDoBlogDaEneSoluções() {
        homeBlogPage.accessWebSite();
    }

    @Quando("eu clico no menu {string}")
    public void euClicoNoMenuMenu(String menu) {
        homeBlogPage.clickButtonMenu(menu);
    }

    @Então("o site deve me direcionar para {string}")
    public void oSiteDeveMeDirecionarParaTela(String tela) {
        Assert.assertTrue(homeBlogPage.validePage(tela));
    }
}
