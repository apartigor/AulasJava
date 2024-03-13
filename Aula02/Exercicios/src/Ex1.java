/*Escrever um algoritmo que receba a altura e a largura de um retângulo e calcule a sua área*/

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Altura");
        double altura = ler.nextDouble();
        System.out.println("Largura");
        double largura = ler.nextDouble();

        double area = altura * largura;

        System.out.println("Área do Retângulo: " + area);
        ler.close();
    }
}
