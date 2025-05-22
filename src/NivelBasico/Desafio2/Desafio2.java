package NivelBasico.Desafio2;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        int escolha;
        int numeroDeNinjas = 0;

        String[] ninjas = new String[3];

        System.out.println("============================================");
        System.out.println("Bem vindo ao Sistema de Cadastro de Ninjas");
        System.out.println("============================================");

        while (continuar) {
            System.out.println("Escolha uma opção");
            System.out.println("1. Cadastrar ninja");
            System.out.println("2. Listar ninjas cadastrados");
            System.out.println("3. Sair");
            System.out.print("Escolha: ");
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    if (numeroDeNinjas == ninjas.length) {
                        String[] aux = ninjas;
                        int novoTamanho = ninjas.length * 2;
                        ninjas = new String[novoTamanho];
                        for (int i = 0; i < aux.length; i++) {
                            ninjas[i] = aux[i];
                        }
                        aux = null;
                    }
                    System.out.print("Nome do ninja: ");
                    ninjas[numeroDeNinjas] = scanner.nextLine();
                    numeroDeNinjas++;
                    System.out.println("Ninja cadastrado com sucesso!!");
                    break;
                case 2:
                    if (ninjas[0] == null) {
                        System.out.println("Nenhum ninja cadastrado.");
                        break;
                    }
                    System.out.println("Lista de ninjas:");
                    for (int i = 0; i < ninjas.length; i++) {
                        if (ninjas[i] == null) {
                            break;
                        }
                        System.out.println(ninjas[i]);
                    }
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Digite um valor válido entre 1 e 3...");
                    break;

            }
            System.out.println("============================================");
        }
        scanner.close();
    }
}
