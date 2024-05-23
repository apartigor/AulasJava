package EXHERANCA;

//É uma...
public class BikeDeTrilha extends Bike {

    public BikeDeTrilha(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    public BikeDeTrilha(int velocidadeMaxima, int carga) {
        super(velocidadeMaxima, carga);
    }

    @Override
    public String toString() {
        return "BikeDeTrilha [cor=" + super.getCor()
                + ", velocidadeAtual=" + velocidadeAtual
                + ", velocidadeMaxima=" + velocidadeMaxima + "]";
    }

}
