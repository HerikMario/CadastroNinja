package NivelBasico.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha o ninja para te defender: ");
        System.out.println("1. Naruto");
        System.out.println("2. Sasuke");
        System.out.println("3. Sakura");

        System.out.println("Escolha: ");
        int escolha = scan.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Você escolheu o Naruto! Que óbvio...");
                break;
            case 2:
                System.out.println("Você escolheu o Sasuke! Esse é pika, só foge muito...");
                break;
            case 3:
                System.out.println("Você escolheu a Sakura! Estranho...");
                break;
            default:
                System.out.println("Você só tinha um trabalho... e fez errado...");
                break;
        }

        scan.close();
    }
}
