public class Aparelho {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        iphone.selecionarMusica("Musica A");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("878465213");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("www.google.com.br");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
