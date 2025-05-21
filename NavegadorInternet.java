public interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarAosFavoritos(String url);
    void atualizarPagina();
    void navegarPara(String url);
}
