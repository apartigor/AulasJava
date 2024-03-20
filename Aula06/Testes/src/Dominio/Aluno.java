package Dominio;

public class Aluno {

    public String matric;

    private String nome;

    public String getNome(){
        return nome;
    }

    // Método Construtor
    public Aluno() {

    }

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, String matric) {
        this.nome = nome;
        this.matric = matric;
    }

    public String nota1;
    public String nota2;

}
