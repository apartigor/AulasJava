import java.util.Scanner;

public class Programa02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Quantas ÁREAS deseja calcular?(Digite um número inteiro)");
        int qtde = ler.nextInt();
        int[] qtde_AREA = new int[qtde];

        double[] base = new double[qtde];
        double[] alt = new double[qtde];
        double[] area = new double[qtde];

        for (int i = 0; i < qtde_AREA.length; i++) {
            System.out.println("Base(" + (i + 1) + "): ");
            base[i] = ler.nextDouble();
            System.out.println("Altura(" + (i + 1) + "): ");
            alt[i] = ler.nextDouble();

            area[i] = base[i] * alt[i];
        }
        for (int i = 0; i < qtde_AREA.length; i++) {
            System.out.println("Area(" + (i + 1) + "): " + area[i]);

        }

        ler.close();
    }
}
