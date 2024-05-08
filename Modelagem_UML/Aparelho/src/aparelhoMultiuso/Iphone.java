package aparelhoMultiuso;

import aparelhoMultiuso.aparelhoTelefonico.AparelhoTelefonico;
import aparelhoMultiuso.navegadorInternet.NavegadorInternet;
import aparelhoMultiuso.reprodutorMusical.ReprodutorMusical;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico{

    @Override
    public void ligar(String numero) {
       System.out.println("Ligando para " + numero);;
    }

    @Override
    public void atender() {
       System.out.println("Atendendo..");;
    }

    @Override
    public void iniciarCorreioDeVoz() {
       System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica " + musica);
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a pagina escolhida");
    }

    @Override
    public void adicionarNovaPagina() {
        System.out.println("Adicionando uma nova pagina");
    }

    @Override
    public void atualizarPagina() {
       System.out.println("Atualizando a pagina...");
    }

    
}
