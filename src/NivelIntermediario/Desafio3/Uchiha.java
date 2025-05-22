package NivelIntermediario.Desafio3;

public class Uchiha extends Ninja {

    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial() {
        System.out.printf("Eu sou %s e minha habilidade especial é %S\n", nome, habilidadeEspecial);
    }

    public void mostrarInformacoes() {
        System.out.printf("Nome do ninja: %s\nIdade do ninja: %d\nHabilidade especial do ninja: %s\nMissão do ninja: %s\nDificuldade da missão: %c\nStatus da missão: %s\n",nome,idade,habilidadeEspecial,missao,nivelDificuldade,statusDaMissao);
    }
}
