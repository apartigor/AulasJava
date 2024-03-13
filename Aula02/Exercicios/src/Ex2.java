/*Crie um algoritmo que permita fazer três conversões monetárias. O algoritmo deve receber o valor em real
(R$) e apresentar os valores convertidos em:
1. Dólar (1 dólar = 5,17 reais)
2. Euro (1 euro = 6,14 reais)
3. Peso argentino (1 peso argentino = 0,05 reais)*/

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha a moeda para qual deseja converter");
        System.out.println("\n 1. Dólar\n 2. Euro\n 3. Peso argentino\n");
        int escolha = ler.nextInt();
        System.out.println("Escreva o valor em REAL(R$): ");
        double valorR = ler.nextDouble();

        if (escolha == 1) {
            double valorD = valorR * 5.17;
            System.out.println("Valor em Dólar: " + valorD);
        } else if (escolha == 2) {
            double valorE = valorR * 6.14;
            System.out.println("Valor em Euro: " + valorE);
        } else if (escolha == 3) {
            double valorPA = valorR * 0.05;
            System.out.println("Valor em Peso argentino: " + valorPA);
        } else {
            System.out.println("Opção Inválida!!");
        }
        ler.close();

    }
}
