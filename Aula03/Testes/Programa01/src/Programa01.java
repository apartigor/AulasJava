import java.util.Scanner;

public class Programa01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Tamanho do vetor: ");
        int tamanho = ler.nextInt();

        int[] tam = new int[tamanho];

        for (int i = 0; i < tam.length; i++) {
            System.out.println("Ola pela " + (i + 1) + " vez");
        }
    }
}
