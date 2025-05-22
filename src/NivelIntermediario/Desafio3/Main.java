package NivelIntermediario.Desafio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Ninja[] ninjas = new Ninja[3];
        int opcao = 0;
        int ninjasCadastrados = 0;

        while (opcao != 5) {
            System.out.println("================== Menu Ninja ==================");
            System.out.println("1. Adicionar ninja");
            System.out.println("2. Listar informações de um ninja");
            System.out.println("3. Listar ninjas cadastrados");
            System.out.println("4. Atribuir uma missão a um ninja");
            System.out.println("5. Sair");
            System.out.print("Escolha: ");
            opcao = scan.nextInt();
            scan.nextLine();

            switchLabel:
            switch (opcao) {
                case 1:
                    if (ninjasCadastrados == ninjas.length) {
                        Ninja[] aux = ninjas;
                        int novoTamanho = ninjas.length * 2;
                        ninjas = new Ninja[novoTamanho];
                        for (int i = 0; i < aux.length; i++) {
                            ninjas[i] = aux[i];
                        }
                        aux = null;
                    }
                    Ninja novoNinja = new Ninja();
                    System.out.print("Nome do novo ninja: ");
                    novoNinja.nome = scan.nextLine();
                    System.out.print("Idade do novo ninja: ");
                    novoNinja.idade = scan.nextInt();
                    scan.nextLine();
                    ninjas[ninjasCadastrados] = novoNinja;
                    ninjasCadastrados++;
                    break;
                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Sem ninjas cadastrados!");
                        break;
                    }
                    String alvo;
                    System.out.print("Qual ninja você quer informações: ");
                    alvo = scan.nextLine();
                    for (Ninja ninja : ninjas) {
                        if (ninja == null) {
                            break;
                        }
                        if (alvo.equals(ninja.nome)) {
                            if (ninja.missao == null) {
                                ninja.mostrarInformacoesParciais();
                                break switchLabel;
                            }
                            ninja.mostrarInformacoesCompletas();
                            break switchLabel;
                        }
                    }
                    System.out.println("Ninja não encontrado!");
                    break;
                case 3:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Sem ninjas cadastrados!");
                        break;
                    }
                    System.out.println("================== Lista de Ninjas ==================");
                    for(Ninja ninja: ninjas) {
                        if (ninja == null) {
                            break;
                        }
                        System.out.println(ninja.nome);
                    }
                    break;
                case 4:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Sem ninjas cadastrados!");
                        break;
                    }
                    System.out.print("Qual ninja você quer atribuir missão: ");
                    alvo = scan.nextLine();
                    for (Ninja ninja : ninjas) {
                        if (ninja == null) {
                            break;
                        }
                        if (alvo.equals(ninja.nome)) {
                            System.out.print("Qual missão quer atribuir pra esse ninja: ");
                            ninja.missao = scan.nextLine();
                            System.out.print("Qual nível da missão: ");
                            ninja.nivelDificuldade = scan.nextLine().charAt(0);
                            ninja.statusDaMissao = "Em andamento";
                            break switchLabel;
                        }
                    }
                    System.out.println("Ninja não encontrado, tente novamente!");
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Comando inválido, tente entre 1 e 5...");
            }
        }

        scan.close();

    }
}
