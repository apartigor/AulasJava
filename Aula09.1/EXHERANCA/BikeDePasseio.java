package EXHERANCA;

//É uma...
public class BikeDePasseio extends Bike {

    public BikeDePasseio(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    public BikeDePasseio(int velocidadeMaxima, int carga) {
        super(velocidadeMaxima, carga);
    }

    @Override
    public String toString() {
        return "BikeDePasseio [cor=" + super.getCor()
                + ", velocidadeAtual=" + velocidadeAtual
                + ", velocidadeMaxima=" + velocidadeMaxima + "]";
    }

}
