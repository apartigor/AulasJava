
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

        Aluno[] alunos = new Aluno[5];

        for (int i = 0; i < 5; i++) {
            alunos[i] = new Aluno();
            System.out.println("Digite a Matricula (" + i + ")");
            alunos[i].matric = ler.nextInt();
            ler.nextLine();
            System.out.println("Digite o nome (" + i + ")");
            alunos[i].nome = ler.nextLine();
            System.out.println("Digite a primeira nota (" + i + ")");
            alunos[i].nota1 = ler.nextDouble();
            System.out.println("Digite a segunda nota (" + i + ")");
            alunos[i].nota2 = ler.nextDouble();

            alunos[i].notaF = (alunos[i].nota1 + alunos[i].nota2) / 2;

            alunos[i].aprovado = alunos[i].notaF >= 6;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("\nMatricula(" + i + "): " + alunos[i].matric);
            System.out.println("Nome(" + i + "): " + alunos[i].nome);
            System.out.println("Aprovado(" + i + "): " + (alunos[i].aprovado ? "(X) Sim ( ) Não " : "( ) Sim (X) Não"));
            System.out.println("Nota Final(" + i + "): " + alunos[i].notaF + "\n");
        }

        ler.close();

    }
}
