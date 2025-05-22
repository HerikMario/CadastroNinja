package NivelIntermediario.FamiliasNinjas;

public class Main {
    public static void main(String[] args) {

        Uzumaki ninja1 = new Uzumaki();

        ninja1.nome = "Naruto";
        ninja1.aldeia = "Aldeia da Folha";
        ninja1.idade = 19;
        ninja1.ativarModoSabio();

        Uchiha ninja2 = new Uchiha();

        ninja2.nome = "Sasuke";
        ninja2.aldeia = "Aldeia da Folha";
        ninja2.idade = 20;
        ninja2.ativarSharingan();

        Haruno ninja3 = new Haruno();

        ninja3.nome = "Sakura";
        ninja3.aldeia = "Aldeia da Folha";
        ninja3.idade = 20;

        ninja3.ativarCura();

        String aldeiaDoNinja = ninja2.buscarAldeia();

        System.out.println("\n" + aldeiaDoNinja);

        int faltaPraSerHokage = ninja1.anosParaSeTornarHokage(80);

        System.out.printf("\nFaltam no mínimo %d anos para se tornar um Hokage", faltaPraSerHokage);

    }
}
