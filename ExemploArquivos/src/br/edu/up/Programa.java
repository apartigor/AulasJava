package br.edu.up;

import br.edu.up.telas.TelaPrincipal;

public class Programa {

    public static void main(String[] args) {

        TelaPrincipal tela = new TelaPrincipal();
        tela.mostrarMenu();

    }

    // public static void main(String[] args) {

    // try{
    // //LER DADOS DE UM ARQUIVO DE TEXTO
    // File arquivoLeitura = new
    // File("C:/_wss/dev_m/ExArquivos/src/arquivo.txt");

    // //Scanner leitor = new Scanner(System.in);//teclado
    // Scanner leitor = new Scanner(arquivoLeitura); //arquivo

    // //Percorrer todas as linhas do arquivo
    // while (leitor.hasNextLine()) {
    // String linha = leitor.nextLine();
    // System.out.println(linha);
    // }

    // leitor.close();
    // } catch(FileNotFoundException e){
    // System.out.println("Arquivo não encontrado!");
    // }

    // //GRAVAR DADOS EM UM ARQUIVO DE TEXTO

    // }
}
