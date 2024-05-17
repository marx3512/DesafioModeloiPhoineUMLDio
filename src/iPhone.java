public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    private String nomeMusica;
    
    @Override
    public void tocar(){
        System.out.println("Esta tocando a musica: " + nomeMusica);
    }

    @Override
    public void pausar(){
        System.out.println("Pausou a musica " + nomeMusica);
    }

    @Override
    public void selecionarMusica(String musica){
        this.nomeMusica = musica;
        System.out.println("Foi selecionado a musica " + this.nomeMusica);
    }

    @Override
    public void ligar(String numero){
        System.out.println("Esta ligando pro numero " + numero);
    }

    @Override
    public void atender(){
        System.out.println("Esta atendendo uma ligacao");
    }

    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Esta inicia um correio de voz");
    }

    @Override
    public void exibirPagina(String url){
        System.out.println("Esta acessando a pagina " + url);
    }

    @Override
    public void adicionarNovaAba(){
        System.out.println("Esta abrindo uma nova aba");
    }

    @Override
    public void atualizarPagina(){
        System.out.println("Esta atualizando pagina");
    }
}
