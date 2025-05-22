package NivelBasico.Condicoes;

public class Ternarios {
    public static void main(String[] args) {

        int missoes = 7;

        String rank = missoes >= 10 ? "Esse ninja está com 10 ou mais missões" : "Esse ninja está com menos de 10 missões";
        System.out.println(rank);

    }
}
