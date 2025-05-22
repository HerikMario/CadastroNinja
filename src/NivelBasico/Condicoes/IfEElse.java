package NivelBasico.Condicoes;

public class IfEElse {
    public static void main(String[] args) {

        // Ninja Naruto
        String nome = "Naruto";
        String rank;

        int idade = 10;
        boolean hokage = false;
        short numeroDeMissoes = 20;

        if (numeroDeMissoes >= 10 &&  idade > 15) {
            rank = "Chunnin";
        } else if (numeroDeMissoes >= 20 &&  idade > 20) {
            rank = "Jounin";
        } else {
            rank = "Gennin";
        }

        System.out.printf("O rank do %s é %s", nome, rank);



    }
}
