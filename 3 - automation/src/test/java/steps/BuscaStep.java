package steps;

import core.DriverFactory;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import page.HomeBlogPage;
import utils.ScreenShotUtils;

public class BuscaStep {

    private final HomeBlogPage homeBlogPage;

    public BuscaStep() {
        homeBlogPage = new HomeBlogPage(DriverFactory.getDriver());
    }

    @Quando("eu faço uma pesquisa pela palavra {string}")
    public void euFacoUmaPesquisaPelaPalavra(String word) {
        homeBlogPage.search(word);
    }

    @Então("o site deve exibir os posts relacionados ao assunto pesquisado")
    public void oSiteDeveExibirPostsRelacionadosAoAssuntoPesquisado() throws Exception {
        Assert.assertTrue(homeBlogPage.postIsVisible());
    }

    @Então("o site deve exibir a mensagem {string} indicando que não há posts relacionados à palavra pesquisada")
    public void oSiteDeveExibirMensagemIndicandoQueNaoHaPostsRelacionadosAPalavraPesquisada(String resultNotFound) {
        Assert.assertTrue(homeBlogPage.resultNotFound(resultNotFound));
    }
}
