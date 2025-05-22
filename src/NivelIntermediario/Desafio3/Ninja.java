package NivelIntermediario.Desafio3;

public class Ninja {

    String nome;
    String missao;
    String statusDaMissao;
    char nivelDificuldade;
    int idade;

    public void mostrarInformacoesCompletas() {
        System.out.printf("Nome do ninja: %s\nIdade do ninja: %d\nMissão do ninja: %s\nDificuldade da missão: %c\nNStatus da missão: %s\n",nome,idade,missao,nivelDificuldade,statusDaMissao);
    }

    public void mostrarInformacoesParciais() {
        System.out.printf("Nome do ninja: %s\nIdade do ninja: %d\n",nome,idade);
    }

}
