public class Iphone implements AparelhoTelefonico,NavegadorInternet,ReprodutorMusical {
    private final String modelo;
    private final int espacoInterno;
    private final String Cor;

    public Iphone(String modelo, int espacoInterno, String cor) {
        this.modelo = modelo;
        this.espacoInterno = espacoInterno;
        Cor = cor;
    }

    public void ligar() {
        System.out.println("Ligando para...");
    }


    public void atender() {
        System.out.println("Atendendo ligação");
    }


    public void iniciarConversaVoz() {
        System.out.println("Iniciando conversa de voz");
    }


    public void exibirPagina() {
        System.out.println("Exibindo página");
    }


    public void adicionarNovaAba() {
        System.out.println("Adicionado nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }


    public void tocar() {
        System.out.println("Dando play na música");
    }


    public void pausar() {
        System.out.println("Pausando música");
    }


    public void selecionarMusica() {
        System.out.println("Selecionado música");
    }
}
