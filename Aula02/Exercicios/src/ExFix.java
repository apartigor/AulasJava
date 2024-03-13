/*▪ Criar um programa para processar as seguintes informações de um aluno:
matrícula, nome , nota1, nota2 e se ele está aprovado ou reprovado;
▪ Durante a execução calcular a nota final do aluno utilizando a seguinte
regra: notaFinal = (nota1 + nota2) / 2. Se a nota final for igual ou superior a
6 o aluno está aprovado, caso contrário estará reprovado;
▪ O programa deverá imprimir o seguinte relatório:
Matrícula: xxxxx
Nome: xxxxx xxxxx
Aprovado: ( x ) Sim ( ) Não
Nota final: xxxxx 
*/

import java.util.Scanner;

public class ExFix {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] matric = new int[5];
        String[] nome = new String[5];
        double[] nota1 = new double[5];
        double[] nota2 = new double[5];
        double[] notaF = new double[5];
        boolean[] aprovado = new boolean[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a Matricula (" + i + ")");
            matric[i] = ler.nextInt();
            ler.nextLine();
            System.out.println("Digite o nome (" + i + ")");
            nome[i] = ler.nextLine();
            System.out.println("Digite a primeira nota (" + i + ")");
            nota1[i] = ler.nextDouble();
            System.out.println("Digite a segunda nota (" + i + ")");
            nota2[i] = ler.nextDouble();

            notaF[i] = (nota1[i] + nota2[i]) / 2;

            aprovado[i] = notaF[i] >= 6;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("\nMatricula(" + i + "): " + matric[i]);
            System.out.println("Nome(" + i + "): " + nome[i]);
            System.out.println("Aprovado(" + i + "): " + (aprovado[i] ? "(X) Sim ( ) Não " : "( ) Sim (X) Não"));
            System.out.println("Nota Final(" + i + "): " + notaF[i] + "\n");
        }
        ler.close();

    }
}
