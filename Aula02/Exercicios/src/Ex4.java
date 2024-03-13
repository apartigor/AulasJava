/*Desenvolver um algoritmo para ler o valor inteiro da idade de uma pessoa e imprimir uma das mensagens:
se idade <= 13: Criança, se idade > 13 e <= 18: Adolescente, se idade > 18 e <= 60: Adulto e se idade > 60:
Idoso. */

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Idade");
        int idade = ler.nextInt();

        if (idade > 0 && idade <= 13) {
            System.out.println("Criança");
        } else if (idade > 13 && idade <= 18) {
            System.out.println("Adolescente");
        } else if (idade > 18 && idade <= 60) {
            System.out.println("Adulto");
        } else if (idade > 60) {
            System.out.println("Idoso");
        } else {
            System.out.println("Idade Inválida!");
        }
        ler.close();
    }

}
