package EXHERANCA;

public abstract class Bike implements Transporte {

    private String cor;
    protected int velocidadeAtual;
    protected int velocidadeMaxima;
    protected int carga;

    @Override
    public int getCarga() {
        return carga;
    }

    public Bike(int velocidadeMaxima, int carga) {
        this.velocidadeMaxima = velocidadeMaxima;
        this.carga = carga;
    }

    public Bike(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    @Override
    public String toString() {
        return "Bike [cor=" + cor + ", velocidadeAtual=" + velocidadeAtual + ", velocidadeMaxima=" + velocidadeMaxima
                + "]";
    }

}
