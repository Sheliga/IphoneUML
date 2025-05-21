public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // ReprodutorMusical
    public void tocar() {
        System.out.println("Tocando música...");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    public void ajustarVolume(int nivel) {
        System.out.println("Ajustando volume para: " + nivel);
    }

    // AparelhoTelefonico
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    public void encerrarChamada() {
        System.out.println("Chamada encerrada.");
    }

    public void acessarContatos() {
        System.out.println("Acessando contatos...");
    }

    // NavegadorInternet
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarAosFavoritos(String url) {
        System.out.println("Adicionando aos favoritos: " + url);
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    public void navegarPara(String url) {
        System.out.println("Navegando para: " + url);
    }
}
