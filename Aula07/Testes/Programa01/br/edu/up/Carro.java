package br.edu.up;

public class Carro extends Veiculo {

    public static enum Tipo {
        FERRARI, UNO;
    }

    /* Atributos, características ou propriedades */
    private Tipo tipo;
    private String modelo;
    private int velocidade = 0;

    /* ----------------------------------------- */

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public Carro() {

    }

    public Carro(Tipo tipo) {
        this.tipo = tipo;
    }

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public void acelerar() {
        if (tipo.equals(Tipo.UNO) && this.velocidade <= 150) {
            this.velocidade++;
        } else if (tipo.equals(Tipo.FERRARI) && this.velocidade <= 300) {
            this.velocidade++;
        }
    }

    public void frear() {
        if (this.velocidade >= 0) {
            this.velocidade--;
        }
    }

}
