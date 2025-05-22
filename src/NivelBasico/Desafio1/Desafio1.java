package NivelBasico.Desafio1;

public class Desafio1 {
    public static void main(String[] args) {
        String nomeNinja1 = "Naruto";
        int idadeNinja1 = 14;
        String nomeDaMissaoNinja1 = "AjudarVelhas";
        char nivelDeDificuldadeDaMissaoNinja1 = 'D';
        String missaoNinja1Conluida = "em andamento";

        String nomeNinja2 = "Sasuke";
        int idadeNinja2 = 18;
        String nomeDaMissaoNinja2 = "Matar o irmão";
        char nivelDeDificuldadeDaMissaoNinja2 = 'A';
        String missaoNinja2Conluida = "em andamento";

        String nomeNinja3 = "Sakura";
        int idadeNinja3 = 14;
        String nomeDaMissaoNinja3 = "Gostar do Sasuke";
        char nivelDeDificuldadeDaMissaoNinja3 = 'B';
        String missaoNinja3Conluida = "em andamento";

        if ((idadeNinja1 < 15 && nivelDeDificuldadeDaMissaoNinja1 == 'A') || (idadeNinja1 < 15 && nivelDeDificuldadeDaMissaoNinja1 == 'B')){
            missaoNinja1Conluida = "não concluída";
        } else {
            missaoNinja1Conluida = "concluída";
        }

        if ((idadeNinja2 < 15 && nivelDeDificuldadeDaMissaoNinja2 == 'A') || (idadeNinja2 < 15 && nivelDeDificuldadeDaMissaoNinja2 == 'B')){
            missaoNinja2Conluida = "não concluída";
        } else {
            missaoNinja2Conluida = "concluída";
        }

        if ((idadeNinja3 < 15 && nivelDeDificuldadeDaMissaoNinja3 == 'A') || (idadeNinja3 < 15 && nivelDeDificuldadeDaMissaoNinja3 == 'B')){
            missaoNinja3Conluida = "não concluída";
        } else {
            missaoNinja2Conluida = "concluída";
        }

        System.out.printf("Nome do ninja 1: %s\n", nomeNinja1);
        System.out.printf("Idade do ninja 1: %s\n", idadeNinja1);
        System.out.printf("Missão do ninja 1: %s\n", nomeDaMissaoNinja1);
        System.out.printf("Nível da missão do ninja 1: %s\n", nivelDeDificuldadeDaMissaoNinja1);
        System.out.printf("Status da missão do ninja 1: %s\n\n", missaoNinja1Conluida);

        System.out.printf("Nome do ninja 2: %s\n", nomeNinja2);
        System.out.printf("Idade do ninja 2: %s\n", idadeNinja2);
        System.out.printf("Missão do ninja 2: %s\n", nomeDaMissaoNinja2);
        System.out.printf("Nível da missão do ninja 2: %s\n", nivelDeDificuldadeDaMissaoNinja2);
        System.out.printf("Status da missão do ninja 2: %s\n\n", missaoNinja2Conluida);

        System.out.printf("Nome do ninja 3: %s\n", nomeNinja3);
        System.out.printf("Idade do ninja 3: %s\n", idadeNinja3);
        System.out.printf("Missão do ninja 3: %s\n", nomeDaMissaoNinja3);
        System.out.printf("Nível da missão do ninja 3: %s\n", nivelDeDificuldadeDaMissaoNinja3);
        System.out.printf("Status da missão do ninja 3: %s\n", missaoNinja3Conluida);

    }
}
