
public class Programa01 {

    public static void imprimir(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        int a, b;
        a = 6;
        b = 2;

        imprimir("A + B = " + Calculadora.somar(a, b));
        imprimir("A - B = " + Calculadora.sub(a, b));
        imprimir("A x B = " + Calculadora.mult(a, b));
        imprimir("A / B = " + Calculadora.div(a, b));
        imprimir("(A + B) x A = " + (Calculadora.somar(a, b) * a));
        imprimir("A + B x A - (A + B) = " + ((Calculadora.mult(a, b) + a) - (Calculadora.somar(a, b))));
    }
}