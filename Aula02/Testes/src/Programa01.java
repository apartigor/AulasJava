import java.util.Scanner;

public class Programa01 {
    public static void main(String[] args) {

        System.out.println("Qual seu agente favorito?");
        Scanner ler = new Scanner(System.in);
        String agente = ler.nextLine();
        if (agente.equals("Reyna")) {
            System.out.println("Você é péssimo!");
        } else {
            System.out.println("Ótimo!!");
        }
    }
}