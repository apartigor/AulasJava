public class Programa02 {
    public static void main(String[] args) {

        for (int i = 0; i < 21; i++) {
            System.out.println("Valor: " + i);
        }

        boolean exec = true;
        int contador = 0;
        String[] letras = new String[] { "A", "B", "C" };

        while (exec && contador < letras.length) {
            String letra = letras[contador];
            System.out.println("Letra: " + letra);
            contador++;
        }

    }
}