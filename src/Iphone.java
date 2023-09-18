import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    int numero;
    String nomeAparelho;
    String appMusica;
    String navegadorInternet;

    public Iphone(int numero, String nomeAparelho, String appMusica, String navegadorInternet) {
        this.numero = numero;
        this.nomeAparelho = nomeAparelho;
        this.appMusica = appMusica;
        this.navegadorInternet = navegadorInternet;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música no " + this.appMusica);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música no " + this.appMusica);
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música no " + this.appMusica);
    }

    @Override
    public void ligar() {
        System.out.println("Iniciando ligação no " + this.nomeAparelho);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação no " + this.nomeAparelho);
    }

    @Override
    public void correioVoz() {
        System.out.println("Iniciando o correio de voz no " + this.nomeAparelho);
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página no navegador " + this.navegadorInternet);
    }

    @Override
    public void novaAba() {
        System.out.println("Abrindo nova aba no navegador " + this.navegadorInternet);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página no navegador " + this.navegadorInternet);
    }

    
    
}
