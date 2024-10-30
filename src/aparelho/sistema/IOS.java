package aparelho.sistema;

import aparelho.internet.NavegadorInternet;
import aparelho.musical.ReprodutorMusical;
import aparelho.telefone.AparelhoTelefonico;

public class IOS implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical {

    @Override
    public void exibirPesquisa(String url) {
        System.out.println(url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Buscando música: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para" + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Grave sua mensagem.");
    }
}
