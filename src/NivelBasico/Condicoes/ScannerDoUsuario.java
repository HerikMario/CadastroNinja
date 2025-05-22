package NivelBasico.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        String aldeia;
        String rank;

        System.out.print("Nome do seu ninja: ");
        nome = scan.nextLine();

        System.out.print("Idade do Ninja: ");
        idade = scan.nextInt();
        scan.nextLine();

        System.out.print("Aldeia do ninja: ");
        aldeia = scan.nextLine();

        System.out.print("Rank do seu ninja: ");
        rank = scan.nextLine();

        scan.close();

        System.out.println("\n");

        if (idade >= 18) {
            System.out.println("Você pode ser um ninja que bebe agora!");
        } else {
            System.out.println("Fique longe das bebidas, ninja");
        }

        System.out.println("\n");

        System.out.println("Aqui suas informações - ");
        System.out.println("Nome do ninja: " + nome);
        System.out.println("Idade do ninja: " + idade);
        System.out.println("Aldeia do ninja: " + aldeia);
        System.out.println("Rank do ninja: " + rank);

    }
}
