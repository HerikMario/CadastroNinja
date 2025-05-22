package NivelBasico.Condicoes;

import java.util.Scanner;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        // desafio musica xuxa
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número de patinhos filhos da mamãe:");
        int numeroDePatinhos = scan.nextInt();

        for (int i = 0; i < numeroDePatinhos; i++) {
            System.out.println((numeroDePatinhos - i) + " patinhos foram passear");
            System.out.println("Além das montanhas");
            System.out.println("Para brincar");
            System.out.println("A mamãe gritou: Quá, quá, quá, quá");
            if (numeroDePatinhos - (i + 1) == 1) {
                System.out.println("Mas só " + (numeroDePatinhos - (i + 1)) + " patinho voltou de lá\n\n");
            } else if (numeroDePatinhos - (i + 1) == 0) {
                System.out.println("Mas nenhum patinho voltou de lá\n\n");
            } else {
                System.out.println("Mas só " + (numeroDePatinhos - (i + 1)) + " patinhos voltaram de lá\n\n");
            }
        }

        System.out.println("A mamãe patinha foi procurar");
        System.out.println("Além das montanhas");
        System.out.println("Na beira do mar");
        System.out.println("A mamãe gritou: Quá, quá, quá, quá");
        System.out.println("E os " + numeroDePatinhos + " patinhos voltaram de lá");

        scan.close();

    }
}
