package steps;

import core.DriverFactory;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import page.HomeBlogPage;

public class BuscaStep {

    private final HomeBlogPage homeBlogPage;


    public BuscaStep() {
        homeBlogPage = new HomeBlogPage(DriverFactory.getDriver());
    }


    @Quando("eu faço uma pesquisa pela palavra {string}")
    public void euFacoUmaPesquisaPelaPalavra(String word) {

    }

    @Quando("eu faço uma pesquisa vazia")
    public void euFacoUmaPesquisaVazia() {

    }

    @Então("o site deve exibir os posts relacionados ao assunto pesquisado")
    public void oSiteDeveExibirPostsRelacionadosAoAssuntoPesquisado() {

    }

    @Então("o site deve exibir a mensagem {string} indicando que não há posts relacionados à palavra pesquisada")
    public void oSiteDeveExibirMensagemIndicandoQueNaoHaPostsRelacionadosAPalavraPesquisada() {

    }

    @Então("o site deve exibir a mensagem {string} indicando que nenhuma palavra-chave foi inserida na pesquisa")
    public void oSiteDeveExibirAMensagemIndincadoQueNenhumaPalavraFoiInseridaNaPesquisa() {

    }

}
