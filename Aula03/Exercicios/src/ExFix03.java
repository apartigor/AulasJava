import java.util.Scanner;

public class ExFix03 {

    public static void imprimir(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double[] nota = new double[5];

        imprimir("Matrícula: ");
        int matric = ler.nextInt();
        ler.nextLine();
        imprimir("Nome: ");
        String nome = ler.nextLine();
        for (int i = 0; i < 5; i++) {
            imprimir("Nota (" + (i + 1) + "): ");
            nota[i] = ler.nextDouble();
            while (nota[i] < 0 || nota[i] > 10) {
                imprimir("Nota Invalida digite a nota entre 0 e 10");
                nota[i] = ler.nextDouble();
            }
        }

        imprimir("Matrícula: " + matric);
        imprimir("Nome: " + nome);
        for (int i = 0; i < 5; i++) {
            imprimir("Nota (" + (i + 1) + "): " + nota[i]);
        }
        ler.close();
    }
}
