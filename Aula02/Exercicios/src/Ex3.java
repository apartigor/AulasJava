/*Receber dois números inteiros e informar qual valor lido é o menor e qual é o maior. */

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva o primeiro número");
        int num1 = ler.nextInt();
        System.out.println("Escreva o segundo número");
        int num2 = ler.nextInt();

        if (num1 > num2) {
            System.out.println("O primeiro número é maior que o segundo");
        } else if (num2 > num1) {
            System.out.println("O segundo número é maior que o primeiro");
        } else {
            System.out.println("São iguais");
        }
        ler.close();
    }

}
