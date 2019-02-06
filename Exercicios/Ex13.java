//3) Leia o nome do usuário e escreva o nome dele na tela 10 vezes.

import java.util.Scanner;
public class Ex13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("----------------------------");
        System.out.println("Seu nome e:");
        for (int i = 0; i < 10; i++) {
            System.out.println(nome);
        }

    }
}