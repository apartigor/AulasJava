import Dominio.*;

class Programa01 {

    public static void main(String[] args) {

        // Exemplo de uso de uma biblioteca de funções (static)
        double a = 100;
        double b = 50;
        double rSoma = Calculadora.somar(a, b);
        double rSub = Calculadora.sub(a, b);
        Double numObj = 10.5;
        String strNum = "100";
        double num = Double.parseDouble(strNum);

        Aluno aluno1obj = new Aluno("Reyna");
        // aluno1obj.nome = "João";

        Aluno aluno2obj = new Aluno("Viper", "002");
        // aluno2obj.nome = "Feijão";
        // aluno2obj.matric = "002";

        Aluno aluno3obj = new Aluno();

        System.out.println("Nome 1: " + aluno1obj.getNome());
        System.out.println("Nome 2: " + aluno2obj.getNome());

    }

    /*public static void main2(String[] args) {

        // Exemplo de uso de objeto + método
        Bike objBike = new Bike();
        objBike.trocarMarcha(5);
        objBike.trocarMarca("Nike");

        System.out.println("Marcha: " + objBike.numeroMarcha);
        System.out.println("Marca: " + objBike.nomeMarca);

    }*/
}