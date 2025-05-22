package NivelIntermediario.FamiliasNinjas;

public class Ninja {

    String nome;
    String aldeia;
    int idade;

    public String buscarAldeia() {
        return aldeia;
    }

    public int anosParaSeTornarHokage (int idadeMinimaParaSerHokage) {
        return idadeMinimaParaSerHokage - idade;
    }


}
