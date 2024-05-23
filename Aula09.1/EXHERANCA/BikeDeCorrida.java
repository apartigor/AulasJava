package EXHERANCA;

//É uma...
public class BikeDeCorrida extends Bike {

    public BikeDeCorrida(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    public BikeDeCorrida(int velocidadeMaxima, int carga) {
        super(velocidadeMaxima, carga);
    }

    @Override
    public String toString() {
        return "BikeDeCorrida [cor=" + super.getCor()
                + ", velocidadeAtual=" + velocidadeAtual
                + ", velocidadeMaxima=" + velocidadeMaxima + "]";
    }

}
